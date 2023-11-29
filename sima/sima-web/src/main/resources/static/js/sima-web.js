(function($) {
	"use strict"; // Start of use strict
	// Configure tooltips for collapsed side navigation
	$('.navbar-sidenav [data-toggle="tooltip"]')
			.tooltip(
					{
						template : '<div class="tooltip navbar-sidenav-tooltip" role="tooltip" style="pointer-events: none;"><div class="arrow"></div><div class="tooltip-inner"></div></div>'
					})
	// Toggle the side navigation
	$("#sidenavToggler")
			.click(
					function(e) {
						e.preventDefault();
						$("body").toggleClass("sidenav-toggled");
						$(".navbar-sidenav .nav-link-collapse").addClass(
								"collapsed");
						$(
								".navbar-sidenav .sidenav-second-level, .navbar-sidenav .sidenav-third-level")
								.removeClass("show");
					});
	// Force the toggled class to be removed when a collapsible nav link is
	// clicked
	$(".navbar-sidenav .nav-link-collapse").click(function(e) {
		e.preventDefault();
		$("body").removeClass("sidenav-toggled");
	});
	// Prevent the content wrapper from scrolling when the fixed side navigation
	// hovered over
	$(
			'body.fixed-nav .navbar-sidenav, body.fixed-nav .sidenav-toggler, body.fixed-nav .navbar-collapse')
			.on('mousewheel DOMMouseScroll', function(e) {
				var e0 = e.originalEvent, delta = e0.wheelDelta || -e0.detail;
				this.scrollTop += (delta < 0 ? 1 : -1) * 30;
				e.preventDefault();
			});
	// Scroll to top button appear
	$(document).scroll(function() {
		var scrollDistance = $(this).scrollTop();
		if (scrollDistance > 100) {
			$('.scroll-to-top').fadeIn();
		} else {
			$('.scroll-to-top').fadeOut();
		}
	});
	// Configure tooltips globally
	$('[data-toggle="tooltip"]').tooltip()
	// Smooth scrolling using jQuery easing
	$(document).on('click', 'a.scroll-to-top', function(event) {
		var $anchor = $(this);
		$('html, body').stop().animate({
			scrollTop : ($($anchor.attr('href')).offset().top)
		}, 1000, 'easeInOutExpo');
		event.preventDefault();
	});
})(jQuery); // End of use strict

var ServerService = angular.module('ServerService', []).service(
		'ServerService',
		function($http, $filter) {
			this.getUserName = function() {
				return $http.get('user');
			};
			this.getLstPartner = function() {
				return $http.get('api/partner');
			};
			this.getLstInsurance = function(searchInsurance) {
				return $http.get('api/insurance', {
					params : {
						partnerId : searchInsurance.partner.partnerId,
						businessPartnerId : searchInsurance.businessPartnerId,
						certificate : searchInsurance.certificate,
						startDate : $filter('date')(searchInsurance.startDate,
								"dd-MM-yyyy")
					}
				});
			};

			this.productCatalogue = function(partnerId) {
				return $http.get('api/productCatalogue', {
					params : {
						partnerID : partnerId,
					}
				});
			};

			this.getReportConciliacion = function(partnerId) {
				return $http.get('api/getReportConciliacion', {
					params : {
						idPartner : partnerId,
					}
				});
			};

			this.getReportFacturacion = function(partnerId) {
				return $http.get('api/getReportFacturacion', {
					params : {
						idPartner : partnerId,
					}
				});
			};

			this.typeRegistroCatalogue = function(partnerId) {
				return $http.get('api/typeRegistroCatalogue', {
					params : {
						partnerID : partnerId,
					}
				});
			};

			this.modalidadCatalogue = function(productId) {
				return $http.get('api/modalidadCatalogue', {
					params : {
						productId : productId,
					}
				});
			};
			this.typeConciliationCatalogue = function() {
				return $http.get('api/typeConciliationCatalogue');
			};

			this.sendConciliation = function(formdata) {
				return $http.post('api/sendConciliation', formdata, {
					transformRequest : angular.identity,
					headers : {
						'Content-Type' : undefined
					}
				});
			};

			this.sendFacturacion = function(formdata) {
				return $http.post('api/sendFacturacion', formdata, {
					transformRequest : angular.identity,
					headers : {
						'Content-Type' : undefined
					}
				});
			};

			this.getSearchInsurance = function(requestI) {
				return $http.get('api/searchInsurance', {
					params : {
						partnerId : requestI.partnerId,
						certificado : requestI.certificado,
						idCliente : requestI.idCliente,
						idSolicitud : requestI.idSolicitud,
						nombre : requestI.nombre,
						sNombre : requestI.sNombre,
						aPaterno : requestI.aPaterno,
						aMaterno : requestI.aMaterno,
						fechaNacimiento : requestI.fechaNacimiento
					}
				});
			};
			this.createFiles = function(lstInsuranceToCreate) {
				return $http.post('api/insurance/files', lstInsuranceToCreate);
			};
			this.getContentFile = function(absolutePath) {
				return $http.get('api/insurance/file', {
					params : {
						absolutePath : absolutePath
					}
				});
			};
			this.sendFile = function(absolutePath, insuranceId, partnerId) {
				return $http.get('api/insurance/file/send', {
					params : {
						absolutePath : absolutePath,
						insuranceId : insuranceId,
						partnerId : partnerId
					}
				});
			};
		});

var SchedulerService = angular.module('SchedulerService', []).service(
		'SchedulerService',
		function($http, $filter) {
			this.getLstJobExecutionsHistory = function(jobName) {
				return $http.get('api/history/job/' + jobName);
			};
			this.stop = function(jobName) {
				return $http.get('api/job/' + jobName + '/stop');
			};
			this.start = function(jobName) {
				return $http.get('api/job/' + jobName + '/start');
			};
			this.execute = function(jobName) {
				return $http.get('api/job/' + jobName + '/execute');
			};
			this.retry = function(jobName, uuid) {
				return $http.get('api/job/' + jobName + '/retry/' + uuid);
			};
			this.getJobProperties = function(jobName) {
				return $http.get('api/job/' + jobName + '/properties');
			}
			this.saveJobProperties = function(jobName, lstJobProperties) {
				return $http.post('api/job/' + jobName + '/properties',
						lstJobProperties);
			}
		});

angular

		.module(
				'adminApp',
				[ 'ngRoute', 'ServerService', 'SchedulerService',
						'angularFileUpload' ])

		.config(
				function($routeProvider, $httpProvider) {
					$routeProvider.when('/', {
						templateUrl : 'login.html',
						controller : 'navigationController'
					})

					.when('/login', {
						templateUrl : 'login.html',
						controller : 'navigationController'
					})

					.when('/dashboard', {
						templateUrl : 'pages/dashboard.html',
						controller : 'dashboardController'
					})

					.when('/envioAlterno', {
						templateUrl : 'pages/envioAlterno.html',
						controller : 'envioAlternoController'
					})

					.when('/consultaSeguro', {
						templateUrl : 'pages/consultaSeguro.html',
						controller : 'consultaSeguroController'
					})

					.when('/conciliarSeguro', {
						templateUrl : 'pages/conciliarSeguro.html',
						controller : 'conciliarSeguroController'
					})

					.when('/registrarFactura', {
						templateUrl : 'pages/registrarFactura.html',
						controller : 'registrarFacturaController'
					}).otherwise('/');

					$httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
				})

		.factory(
				'authHttpResponseInterceptor',
				[ '$q', '$location', '$window',
						function($q, $location, $window) {
							return {
								response : function(response) {
									$("#spinner").hide();

									return response || $q.when(response);
								},
								responseError : function(rejection) {
									if (rejection.status === 401) {
										$location.path('/');
									}
									$("#spinner").hide();

									return $q.reject(rejection);
								}
							}
						} ])

		.config(
				[
						'$httpProvider',
						function($httpProvider) {
							$httpProvider.interceptors
									.push('authHttpResponseInterceptor');

							var spinnerFunction = function spinnerFunction(
									data, headersGetter) {
								$("#spinner").show();
								return data;

							};

							$httpProvider.defaults.transformRequest
									.push(spinnerFunction);
						} ])

		.controller(
				'dashboardController',
				function($scope, $timeout, SchedulerService, $window) {
					var progressLapse = 5000;
					var promise;

					$scope.selectedJobName = "headers";
					$scope.lstJobExecutionsHistory = [];
					$scope.lstJobProperties = [];
					$scope.jobPropertiesName = null;
					$scope.stepErrorScheduler = 0;

					$scope.connected = false;
					$scope.lstMessages = [];

					$scope.from = "From";
					$scope.text = "Text";

					var timer = function() {
						getLstJobExecutionsHistory();
					}

					$scope.$on('$destroy', function() {
						$timeout.cancel(promise);
					});

					var clearAlertMessage = function() {
						$scope.alertMessage = null;
						$scope.alertType = null;
					}

					var getLstJobExecutionsHistory = function() {
						clearAlertMessage();

						SchedulerService
								.getLstJobExecutionsHistory(
										$scope.selectedJobName)
								.success(function(data) {
									$scope.lstJobExecutionsHistory = data;
									$scope.stepErrorScheduler = 0;
								})
								.error(
										function(error) {
											$scope.alertMessage = "No fue posible obtener información sobre las ejecuciones de los jobs.";
											$scope.alertType = "danger";
											$scope.lstJobExecutionsHistory = [];
											$scope.stepErrorScheduler++;
											if ($scope.stepErrorScheduler > 3) {
												$scope.logout();
											}
											if ($scope.stepErrorScheduler > 4) {
												$window.location.reload();
											}
										});

						promise = $timeout(timer, progressLapse);
					}

					$scope.getLstJobExecutionsHistory = function() {
						getLstJobExecutionsHistory();
					}

					var stop = function(jobName) {
						clearAlertMessage();

						SchedulerService
								.stop(jobName)
								.success(function(data) {
									refreshJobsInfo();
								})
								.error(
										function(error) {
											$scope.alertMessage = "Error al intentar detener la programación del job.";
											$scope.alertType = "danger";
										});
					}

					$scope.stop = function(jobName) {
						stop(jobName);
					}

					var start = function(jobName) {
						clearAlertMessage();

						SchedulerService
								.start(jobName)
								.success(function(data) {
									refreshJobsInfo();
								})
								.error(
										function(error) {
											$scope.alertMessage = "Error al intentar iniciar la programación del job.";
											$scope.alertType = "danger";
										});
					}

					$scope.start = function(jobName) {
						start(jobName);
					}

					var execute = function(jobName) {
						clearAlertMessage();

						SchedulerService
								.execute(jobName)
								.success(function(data) {
									refreshJobsInfo();
								})
								.error(
										function(error) {
											$scope.alertMessage = "Error al intentar la ejecución del job.";
											$scope.alertType = "danger";
										});
					}

					$scope.execute = function(jobName) {
						execute(jobName);
					}

					var retry = function(jobName, uuid) {
						clearAlertMessage();

						SchedulerService
								.retry(jobName, uuid)
								.success(function(data) {
									selectJobName(jobName);
								})
								.error(
										function(error) {
											$scope.alertMessage = "Errror al intentar de nueva cuenta la ejecución del job.";
											$scope.alertType = "danger";
										});
					}

					$scope.retry = function(jobName, uuid) {
						selectJobName(jobName);
						retry(jobName, uuid);
					}

					var refreshJobsInfo = function() {
						$timeout.cancel(promise);
						getLstJobExecutionsHistory();
					}

					var selectJobName = function(jobName) {
						$scope.selectedJobName = jobName;
						refreshJobsInfo();
					}

					$scope.toggleJobName = function(jobName) {
						if ($scope.selectedJobName == jobName) {
							$scope.selectedJobName = 'headers';
						} else {
							$scope.selectedJobName = jobName;
						}
						refreshJobsInfo();
					}

					var saveJobProperties = function(jobName, lstJobProperties) {
						clearAlertMessage();

						SchedulerService
								.saveJobProperties(jobName, lstJobProperties)
								.success(
										function(data) {
											$scope.lstJobProperties = data;

											$scope.alertModalMessage = "Se han almacenado correctamente los cambios a la configuración del Job.";
											$scope.alertModalType = "success";
										})
								.error(
										function(error) {
											$scope.alertModalMessage = "Errror al intentar guardar las propiedades del job.";
											$scope.alertModalType = "danger";
										});
					}

					$scope.saveJobProperties = function() {
						var response = confirm("¿Está seguro que desea guardar los cambios?");
						if (response) {
							saveJobProperties($scope.jobPropertiesName,
									$scope.lstJobProperties);
						}
					}

					$('#documentModal')
							.on(
									'show.bs.modal',
									function(event) {
										var button = $(event.relatedTarget);
										var jobName = button.data('name');
										var modal = $(this);
										modal.find('.modal-title').text(
												'Configuración del job ['
														+ jobName + ']');

										$scope.alertModalMessage = null;
										$scope.alertModalType = null;

										SchedulerService
												.getJobProperties(jobName)
												.success(
														function(data) {
															$scope.lstJobProperties = data;
															$scope.jobPropertiesName = jobName;

														})
												.error(
														function(error) {
															$scope.alertModalMessage = "No fue posible obtener las propiedades del job.";
															$scope.alertModalType = "danger";
															$scope.lstJobProperties = [];

														});
									})
				})

		.controller(
				'envioAlternoController',
				function($scope, ServerService) {
					$scope.partnerCatalogue = [];
					$scope.searchInsurance = {
						partner : null,
						idCliente : null,
						certificado : null,
						inicioVigencia : null
					};
					$scope.selectedPartner = null;
					$scope.selectedIndex = [];
					$scope.lstInsurance = [];
					$scope.generatedFiles = false;
					$scope.pendingSends = false;

					var getLstPartner = function() {
						ServerService
								.getLstPartner()
								.success(function(data) {
									$scope.partnerCatalogue = data;
								})
								.error(
										function(error) {
											$scope.alertMessage = "No fue posible obtener la información de los socios.";
											$scope.alertType = "danger";
										});
					}

					$scope.getLstPartner = function() {
						getLstPartner();
					}

					var clearAlertMessage = function() {
						$scope.alertMessage = null;
						$scope.alertType = null;
					}

					var getLstInsurance = function() {
						removeAlert();

						$scope.generatedFiles = false;

						ServerService
								.getLstInsurance($scope.searchInsurance)
								.success(
										function(data) {
											$scope.selectedPartner = $scope.searchInsurance.partner;
											$scope.lstInsurance = data;

											var table = $('#dataTable')
													.DataTable({
														retrieve : true,
														searching : false
													});

											table.destroy();

											$('#dataTable').empty();

											table = $('#dataTable')
													.DataTable(
															{
																select : {
																	style : 'multiple'
																},
																data : data,
																columns : [
																		{
																			title : "Socio",
																			data : "partner.name"
																		},
																		{
																			title : "Id. Cliente",
																			data : "businessPartner.businessPartnerId"
																		},
																		{
																			title : "Producto",
																			data : "product.productId"
																		},
																		{
																			title : "Modalidad",
																			data : "mode.description"
																		},
																		{
																			title : "Id. Solicitud Seguro",
																			data : "insuranceId"
																		},
																		{
																			title : "Certificado",
																			data : "certificate"
																		},
																		{
																			title : "Nombre Titular",
																			data : "businessPartner.name"
																		},
																		{
																			title : "Inicio Vigencia",
																			data : "startDateFormatted"
																		},
																		{
																			title : "Fin Vigencia",
																			data : "endDateFormatted"
																		},
																		{
																			title : "Estatus Seguro",
																			data : "status.name"
																		}, ]
															});

											table
													.on(
															'select',
															function(e, dt,
																	type,
																	indexes) {
																if (type === 'row') {
																	index = indexes[0];
																	if ($scope.selectedIndex
																			.indexOf(index) == -1) {
																		$scope.selectedIndex
																				.push(index);
																		$scope
																				.$apply();
																	}
																}
															});

											table
													.on(
															'deselect',
															function(e, dt,
																	type,
																	indexes) {
																if (type === 'row') {
																	index = indexes[0];
																	$scope.selectedIndex
																			.splice(
																					$scope.selectedIndex
																							.indexOf(index),
																					1);
																	$scope
																			.$apply();
																}
															});

											$scope.selectedIndex = [];
										})
								.error(
										function(error) {
											$scope.alertMessage = "No fue posible obtener la información de seguros";
											$scope.alertType = "danger";
										});
					}

					$scope.getLstInsurance = function() {
						getLstInsurance();
					}

					var createFiles = function() {
						removeAlert();

						var lstInsuranceToCreate = [];

						if ($scope.lstInsurance) {
							for (i = 0; i < $scope.lstInsurance.length; i++) {
								if ($scope.selectedIndex.indexOf(i) >= 0) {
									lstInsuranceToCreate
											.push($scope.lstInsurance[i]);
								}
							}
						}

						ServerService
								.createFiles(lstInsuranceToCreate)
								.success(
										function(data) {
											$scope.lstFile = data;
											$scope.generatedFiles = true;

											if (data && data.length == 0) {
												$scope.alertMessage = "No se encontraron registros pendientes por enviar para el seguro seleccionado";
												$scope.alertType = "warning";
											}

											pendingSends();
										})
								.error(
										function(error) {
											$scope.alertMessage = "No fue posible realizar la creación de archivos";
											$scope.alertType = "danger";
										});
					}

					$scope.createFiles = function() {
						createFiles();
					}

					var sendFiles = function() {
						removeAlert();

						if ($scope.lstFile) {
							for (i = 0; i < $scope.lstFile.length; i++) {
								if ($scope.lstFile[i].status != "ENVIADO"
										&& $scope.lstFile[i].status != "ENVIANDO") {
									$scope.lstFile[i].status = "ENVIANDO";

									var msgResponse = null;

									ServerService
											.sendFile(
													$scope.lstFile[i].absolutePath,
													$scope.lstFile[i].insuranceId,
													$scope.lstFile[i].partnerId)
											.success(
													function(data) {
														if ($scope.lstFile) {
															for (j = 0; j < $scope.lstFile.length; j++) {
																if ($scope.lstFile[j].absolutePath == data.absolutePath) {
																	if (data.msgResponse.code == 0) {
																		$scope.lstFile[j].status = "ENVIADO";
																	} else {
																		$scope.lstFile[j].status = "ERROR AL ENVIAR";

																		$scope.alertMessage = "No fue posible completar el envío de archivos";
																		$scope.alertType = "danger";
																	}

																	break;
																}
															}
														}

														pendingSends();
													})
											.error(
													function(error) {
														$scope.alertMessage = "No fue posible realizar el envío de archivos";
														$scope.alertType = "danger";

														pendingSends();
													});
								}
							}
						}
					}

					$scope.sendFiles = function() {
						sendFiles();
					}

					var pendingSends = function() {
						$scope.pendingSends = false;

						if ($scope.lstFile) {
							for (i = 0; i < $scope.lstFile.length; i++) {
								if ($scope.lstFile[i].status == "CREADO"
										|| $scope.lstFile[i].status == "ERROR AL ENVIAR") {
									$scope.pendingSends = true;
								}
							}
						}
					}

					$('#documentModal')
							.on(
									'show.bs.modal',
									function(event) {
										var button = $(event.relatedTarget);
										var fileName = button.data('name');
										var absolutePath = button.data('path');
										var modal = $(this);
										modal.find('.modal-title').text(
												'Contenido del archivo '
														+ fileName);

										ServerService
												.getContentFile(absolutePath)
												.success(
														function(data) {
															modal
																	.find(
																			'.modal-body textarea')
																	.val(
																			data.content);
														})
												.error(
														function(error) {
															$scope.alertMessage = "No fue posible obtener el contenido del archivo "
																	+ fileName;
															$scope.alertType = "danger";
														});
									})

					var removeAlert = function() {
						$scope.alertType = null;
						$scope.alertMessage = null;

						$scope.alertItemType = null;
						$scope.alertItemMessage = null;
					}

					$scope.removeAlert = function() {
						removeAlert();
					}

				})

		.controller(
				'conciliarSeguroController',
				function($scope, $filter, ServerService, FileUploader) {
					$scope.getLstPartner = function() {

						ServerService
								.getLstPartner()
								.success(
										function(data) {
											var defecto = new Object();
											defecto.name = 'SELECIONE SOCIO...';
											defecto.partnerId = 0;
											data.unshift(defecto);
											$scope.partnerCatalogue = data;
											$scope.partnerCatalogue.selected = $scope.partnerCatalogue[0];
											$scope
													.getProductCatalogue($scope.partnerCatalogue[0].partnerId);
										})
								.error(
										function(error) {
											$scope.alertMessage = "No fue posible obtener la información de los socios.";
											$scope.alertType = "danger";
										});
					}

					$scope.getConciliationCatalogue = function() {
						ServerService
								.typeConciliationCatalogue()
								.success(
										function(data) {
											var defecto = new Object();
											defecto.name = 'SELECIONE CONCILIACION...';
											defecto.id = 0;
											data.unshift(defecto);
											$scope.conciliationCatalogue = data;
											$scope.conciliationCatalogue.selected = $scope.conciliationCatalogue[0];
										})
								.error(
										function(error) {
											$scope.alertMessage = "No fue posible obtener la información del catalogo de conciliacion.";
											$scope.alertType = "danger";
										});
					}

					var defaultProduct = new Object();
					defaultProduct.productName = 'SELECIONE PRODUCTO...';
					defaultProduct.productId = 0;
					$scope.getProductCatalogue = function(idPartner) {

						if (idPartner != 0) {
							ServerService
									.productCatalogue(idPartner)
									.success(
											function(data) {
												data.unshift(defaultProduct);
												$scope.productoCatalogue = data;
												$scope.productoCatalogue.selected = $scope.productoCatalogue[0];
												$scope
														.getModalidadCatalogue($scope.productoCatalogue.selected.productId);
											})
									.error(
											function(error) {
												$scope.alertMessage = "No fue posible obtener la información del catalogo de productos.";
												$scope.alertType = "danger";
											});
						} else {
							$scope.productoCatalogue = [ defaultProduct ];
							$scope.productoCatalogue.selected = $scope.productoCatalogue[0];
							$scope
									.getModalidadCatalogue($scope.productoCatalogue.selected.productId);
						}

					}

					var defaultModalidad = new Object();
					defaultModalidad.description = 'SELECIONE...';
					defaultModalidad.id = 0;
					$scope.getModalidadCatalogue = function(idProduct) {

						if (idProduct != 0) {
							ServerService
									.modalidadCatalogue(idProduct)
									.success(
											function(data) {
												data.unshift(defaultModalidad);
												$scope.modalidadCatalogue = data;
												$scope.modalidadCatalogue.selected = $scope.modalidadCatalogue[0];

											})
									.error(
											function(error) {
												$scope.alertMessage = "No fue posible obtener la información del catalogo de modalidades.";
												$scope.alertType = "danger";
											});
						} else {
							$scope.modalidadCatalogue = [ defaultModalidad ];
							$scope.modalidadCatalogue.selected = $scope.modalidadCatalogue[0];

						}

					}

					$scope.comboProductChange = function() {
						$scope
								.getModalidadCatalogue($scope.productoCatalogue.selected.productId);
					}

					$scope.comboPartnerChange = function() {
						$scope
								.getProductCatalogue($scope.partnerCatalogue.selected.partnerId);
					}

					$scope.getDataForm = function() {
						var FormularioConciliacion = new Object();
						FormularioConciliacion['idPartner'] = $scope.partnerCatalogue.selected.partnerId;
						FormularioConciliacion['typeCons'] = $scope.conciliationCatalogue.selected.id;
						FormularioConciliacion['idProduct'] = $scope.productoCatalogue.selected.productId;
						FormularioConciliacion['idModalidad'] = $scope.modalidadCatalogue.selected.id;
						FormularioConciliacion['stardatePeriodo'] = $filter(
								'date')($scope.startdatePeriodo, "yyyyMMdd");
						FormularioConciliacion['enddatePeriodo'] = $filter(
								'date')($scope.enddatePeriodo, "yyyyMMdd");
						FormularioConciliacion['startDateCierre'] = $filter(
								'date')($scope.startdateCierre, "yyyyMMdd");
						FormularioConciliacion['enddateCierre'] = $filter(
								'date')($scope.enddateCierre, "yyyyMMdd");
						return JSON.stringify(FormularioConciliacion);
					}

					$scope.sendConciliacion = function() {

						$
								.blockUI({
									css : {
										border : 'none',
										padding : '15px',
										backgroundColor : '#000',
										'-webkit-border-radius' : '10px',
										'-moz-border-radius' : '10px',
										opacity : .5,
										color : '#fff'
									},
									message : '<i class="fa fa-spinner fa-pulse fa-3x fa-fw"></i>Obteniendo los datos...'
								});
						var formData = new FormData();
						var totalFiles = uploader.queue.length;
						for (var i = 0; i < totalFiles; i++) {
							formData.append("file", uploader.queue[i]._file);
						}
						formData.append("FormularioConciliacion", $scope
								.getDataForm());

						ServerService
								.sendConciliation(formData)
								.success(function(data) {
									$scope.showModalCifrasControl(data);
									$.unblockUI();
									uploader.queue[0].remove();
									$('INPUT[type="file"]').val('');
								})
								.error(
										function(error) {
											$scope.alertMessage = "Error al procesar solicitud de conciliacion.";
											$scope.alertType = "danger";
											uploader.queue[0].remove();
											$('INPUT[type="file"]').val('');
											$.unblockUI();
										});
					}

					$scope.eliminarFileSelect = function(item) {
						item.remove();
						$('INPUT[type="file"]').val('');
					}

					$scope.exportFile = function() {
						window.open('api/getReportConciliacion?idPartner='
								+ $scope.partnerCatalogue.selected.partnerId,
								'_blank', '');
					}

					$scope.showModalCifrasControl = function(data) {
						$scope.respConciliacion = data;
						$('#documentModal').modal({
							backdrop : 'static',
							keyboard : false
						});
					}

					$scope.errorFechas = true;
					$scope.changeStartDatePe = function(id) {

						$scope.errorFechas = false;
						if ($scope.startdateCierre != null
								&& $scope.enddateCierre != null
								&& new Date($scope.startdateCierre) > new Date(
										$scope.enddateCierre)) {
							$scope.errorFechas = true
							$scope.errorMsg = "La fecha Cierre Desde no puede ser mayor a la fecha Cierre Hasta"
							$('#modalError').modal({
								backdrop : 'static',
								keyboard : false
							})
						}

						if ($scope.startdatePeriodo != null
								&& $scope.enddatePeriodo != null
								&& new Date($scope.startdatePeriodo) > new Date(
										$scope.enddatePeriodo)) {
							$scope.errorFechas = true
							$scope.errorMsg = "La fecha Periodo desde no puede ser mayor a la fecha Periodo Hasta"
							$('#modalError').modal({
								backdrop : 'static',
								keyboard : false
							})
						}

					}

					$scope.getLstPartner();
					$scope.getConciliationCatalogue();

					var uploader = $scope.uploader = new FileUploader();

					// a sync filter
					uploader.filters.push({
						name : 'syncFilter',
						fn : function(item /* {File|FileLikeObject} */,
								options) {
							return this.queue.length < 10;
						}
					});

					// an async filter
					uploader.filters.push({
						name : 'asyncFilter',
						fn : function(item /* {File|FileLikeObject} */,
								options, deferred) {
							setTimeout(deferred.resolve, 1e3);
						}
					});

					$scope.fileValidUpload = true;

					$('INPUT[type="file"]')
							.change(
									function() {
										var ext = this.value
												.substring(this.value
														.lastIndexOf("."));
										switch (ext) {
										case '.D':
										case '.d':
											$scope.fileValidUpload = false;
											break;
										default:
											$scope.fileValidUpload = true;
											$scope.errorMsg = "La extensión del archivo debe ser .d"
											$('#modalError').modal({
												backdrop : 'static',
												keyboard : false
											});

										}
									});

					// CALLBACKS

					uploader.onWhenAddingFileFailed = function(
							item /* {File|FileLikeObject} */, filter, options) {
						console.info('onWhenAddingFileFailed', item, filter,
								options);
					};
					uploader.onAfterAddingFile = function(fileItem) {
						console.info('onAfterAddingFile', fileItem);
					};
					uploader.onAfterAddingAll = function(addedFileItems) {
						console.info('onAfterAddingAll', addedFileItems);
					};
					uploader.onBeforeUploadItem = function(item) {
						console.info('onBeforeUploadItem', item);
					};
					uploader.onProgressItem = function(fileItem, progress) {
						console.info('onProgressItem', fileItem, progress);
					};
					uploader.onProgressAll = function(progress) {
						console.info('onProgressAll', progress);
					};
					uploader.onSuccessItem = function(fileItem, response,
							status, headers) {
						console.info('onSuccessItem', fileItem, response,
								status, headers);
					};
					uploader.onErrorItem = function(fileItem, response, status,
							headers) {
						console.info('onErrorItem', fileItem, response, status,
								headers);
					};
					uploader.onCancelItem = function(fileItem, response,
							status, headers) {
						console.info('onCancelItem', fileItem, response,
								status, headers);
					};
					uploader.onCompleteItem = function(fileItem, response,
							status, headers) {
						console.info('onCompleteItem', fileItem, response,
								status, headers);
					};
					uploader.onCompleteAll = function() {
						console.info('onCompleteAll');
					};

				})

		.controller(
				'consultaSeguroController',
				function($scope, $filter, ServerService) {

					$scope.sinRegistros = false;

					$scope.getLstPartner = function() {
						ServerService
								.getLstPartner()
								.success(
										function(data) {
											$scope.partnerCatalogue = data;
											$scope.partnerCatalogue.selected = $scope.partnerCatalogue[0];
										})
								.error(
										function(error) {
											$scope.alertMessage = "No fue posible obtener la información de los socios.";
											$scope.alertType = "danger";
										});
					}

					$scope.changeRadioButtonBusqueda = function() {
						$scope.cleanForm();
						$scope.textoBusqueda = $scope.radioBusqueda == 1 ? 'Certificado'
								: $scope.radioBusqueda == 2 ? 'Id Cliente'
										: 'Id Solicitud';
					}

					$scope.searchInsurance = function() {
						$scope.sinRegistros = false;
						var requestI = $scope.getInfoInsurance();
						ServerService
								.getSearchInsurance(requestI)
								.success(
										function(data) {
											if (data.length > 0) {
												$scope.lstInsurance = data;
											} else {
												$scope.sinRegistros = true;
												$scope.alertMessage = "No hay registros.";
												$scope.alertType = "danger";
											}

										}).error(function(error) {
									$scoppe.sinRegistros = true;
									$scope.alertMessage = "No hay registros.";
									$scope.alertType = "danger";
								});

					}

					$scope.getInfoInsurance = function() {
						var requestI = new Object();
						requestI.partnerId = $scope.partnerCatalogue.selected.partnerId;
						requestI.certificado = $scope.radioBusqueda == 1 ? $scope.campoIdBusqueda
								: '';
						requestI.idCliente = $scope.radioBusqueda == 2 ? $scope.campoIdBusqueda
								: '';
						requestI.idSolicitud = $scope.radioBusqueda == 3 ? $scope.campoIdBusqueda
								: '';
						requestI.nombre = $scope.radioBusqueda == 4 ? $scope.nombreBus
								: '';
						requestI.sNombre = $scope.radioBusqueda == 4 ? $scope.sNombreBus != null
								&& $scope.sNombreBus != '' ? $scope.sNombreBus
								: ''
								: '';
						requestI.aPaterno = $scope.radioBusqueda == 4 ? $scope.paternoBus
								: '';
						requestI.aMaterno = $scope.radioBusqueda == 4 ? $scope.maternoBus != null
								&& $scope.maternoBus != '' ? $scope.maternoBus
								: ''
								: '';
						requestI.fechaNacimiento = $scope.radioBusqueda == 4 ?

						$scope.nacimientoBus != null
								&& $scope.nacimientoBus != '' ? $filter('date')
								($scope.nacimientoBus, "dd-MM-yyyy") : '' : '';
						return requestI;
					}

					$scope.cleanForm = function() {
						$scope.campoIdBusqueda = '';
						$scope.nombreBus = '';
						$scope.paternoBus = '';
						$scope.maternoBus = '';
						$scope.nacimientoBus = '';
						$scope.sinRegistros = false;
					}

					$scope.exportInsurance = function() {
						var downloadLink;
						var filename = '';
						var tableID = "tabla";
						var dataType = 'application/vnd.ms-excel';
						var tableSelect = document.getElementById(tableID);
						var tableHTML = tableSelect.outerHTML.replace(/ /g,
								'%20');

						// Specify file name
						filename = filename ? filename + '.xls'
								: 'excel_data.xls';

						// Create download link element
						downloadLink = document.createElement("a");

						document.body.appendChild(downloadLink);

						if (navigator.msSaveOrOpenBlob) {
							var blob = new Blob([ 'ufeff', tableHTML ], {
								type : dataType
							});
							navigator.msSaveOrOpenBlob(blob, filename);
						} else {
							// Create a link to the file
							downloadLink.href = 'data:' + dataType + ', '
									+ tableHTML;

							// Setting the file name
							downloadLink.download = filename;

							// triggering the function
							downloadLink.click();
						}
					}

					$scope.getLstPartner();
					$scope.radioBusqueda = 1;
					$scope.textoBusqueda = 'Certificado';

				})

		.controller(
				'registrarFacturaController',
				function($rootScope, $scope, $filter, ServerService,
						FileUploader, $location) {
					var namePage = '#registrarFactura';

					$scope.getLstPartner = function() {
						ServerService
								.getLstPartner()
								.success(
										function(data) {
											var defecto = new Object();
											defecto.name = 'SELECIONE SOCIO...';
											defecto.partnerId = 0;
											data.unshift(defecto);
											$scope.partnerCatalogue = data;
											$scope.partnerCatalogue.selected = $scope.partnerCatalogue[0];
											$scope
													.getProductCatalogue($scope.partnerCatalogue[0].partnerId);
											$scope
													.typeRegistroCatalogue($scope.partnerCatalogue[0].partnerId);
										})
								.error(
										function(error) {
											$scope.alertMessage = "No fue posible obtener la información de los socios.";
											$scope.alertType = "danger";
										});
					}

					var defaultProduct = new Object();
					defaultProduct.productName = 'SELECIONE PRODUCTO...';
					defaultProduct.productId = 0;
					$scope.getProductCatalogue = function(idPartner) {

						if (idPartner != 0) {
							ServerService
									.productCatalogue(idPartner)
									.success(
											function(data) {
												data.unshift(defaultProduct);
												$scope.productoCatalogue = data;
												$scope.productoCatalogue.selected = $scope.productoCatalogue[0];
												$scope
														.getModalidadCatalogue($scope.productoCatalogue.selected.productId);
											})
									.error(
											function(error) {
												$scope.alertMessage = "No fue posible obtener la información del catalogo de productos.";
												$scope.alertType = "danger";
											});
						} else {
							$scope.productoCatalogue = [ defaultProduct ];
							$scope.productoCatalogue.selected = $scope.productoCatalogue[0];
							$scope
									.getModalidadCatalogue($scope.productoCatalogue.selected.productId);
						}

					}

					var defaultRegistro = new Object();
					defaultRegistro.name = 'SELECIONE...';
					defaultRegistro.id = 0;
					$scope.typeRegistroCatalogue = function(idPartner) {
						if (idPartner != 0) {
							ServerService
									.typeRegistroCatalogue(idPartner)
									.success(
											function(data) {
												data.unshift(defaultRegistro);
												$scope.typeRegistrosCatalogue = data;
												$scope.typeRegistrosCatalogue.selected = $scope.typeRegistrosCatalogue[0];
											})
									.error(
											function(error) {
												$scope.alertMessage = "No fue posible obtener la información de los tipos de registros.";
												$scope.alertType = "danger";
											});
						} else {
							$scope.typeRegistrosCatalogue = [ defaultRegistro ];
							$scope.typeRegistrosCatalogue.selected = $scope.typeRegistrosCatalogue[0];
						}

					}

					var defaultModalidad = new Object();
					defaultModalidad.description = 'SELECIONE...';
					defaultModalidad.id = 0;
					$scope.getModalidadCatalogue = function(idProduct) {

						if (idProduct != 0) {
							ServerService
									.modalidadCatalogue(idProduct)
									.success(
											function(data) {
												data.unshift(defaultModalidad);
												$scope.modalidadCatalogue = data;
												$scope.modalidadCatalogue.selected = $scope.modalidadCatalogue[0];

											})
									.error(
											function(error) {
												$scope.alertMessage = "No fue posible obtener la información del catalogo de modalidades.";
												$scope.alertType = "danger";
											});
						} else {
							$scope.modalidadCatalogue = [ defaultModalidad ];
							$scope.modalidadCatalogue.selected = $scope.modalidadCatalogue[0];

						}

					}

					$scope.getReportFact = function() {
						window.open('api/getReportFacturacion?idPartner='
								+ $scope.partnerCatalogue.selected.partnerId,
								'_blank', '');
					}

					$scope.getDataForm = function() {
						var FormularioFacturacion = new Object();
						FormularioFacturacion['idPartner'] = $scope.partnerCatalogue.selected.partnerId;
						FormularioFacturacion['idProduct'] = $scope.productoCatalogue.selected.productId;
						FormularioFacturacion['idModalidad'] = $scope.modalidadCatalogue.selected.id;
						FormularioFacturacion['idRegistro'] = $scope.typeRegistrosCatalogue.selected.id;
						FormularioFacturacion['stardate'] = $filter('date')(
								$scope.startdate, "MM/dd/yyyy");
						FormularioFacturacion['enddate'] = $filter('date')(
								$scope.enddate, "MM/dd/yyyy");
						return JSON.stringify(FormularioFacturacion);
					}

					$scope.sendFacturacion = function() {
						$
								.blockUI({
									css : {
										border : 'none',
										padding : '15px',
										backgroundColor : '#000',
										'-webkit-border-radius' : '10px',
										'-moz-border-radius' : '10px',
										opacity : .5,
										color : '#fff'
									},
									message : '<i class="fa fa-spinner fa-pulse fa-3x fa-fw"></i>Obteniendo los datos...'
								});
						var formData = new FormData();
						var totalFiles = uploader.queue.length;
						for (var i = 0; i < totalFiles; i++) {
							formData.append("file", uploader.queue[i]._file);
						}
						formData.append("FormularioFacturacion", $scope
								.getDataForm());

						ServerService.sendFacturacion(formData).success(
								function(data) {
									$.unblockUI();
									if (data.succes) {
										$scope.ccfResponse = data;
										$('#documentModal').modal({
											backdrop : 'static',
											keyboard : false
										});
									} else {
										$scope.errorMsg = data.msg;
										$('#modalError').modal({
											backdrop : 'static',
											keyboard : false
										});
										
									}
									
									
									$('INPUT[type="file"]').val('');
									uploader.queue[0].remove();
									$scope.archivoInvalid = true;
								}).error(function(error) {
									$scope.errorMsg = error;
							$.unblockUI();
							$('INPUT[type="file"]').val('');
							uploader.queue[0].remove();
							$scope.archivoInvalid = true;
							$('#modalError').modal({
								backdrop : 'static',
								keyboard : false
							});
						});
					}

					$scope.comboProductChange = function() {
						$scope
								.getModalidadCatalogue($scope.productoCatalogue.selected.productId);
					}

					$scope.comboPartnerChange = function() {
						$scope
								.getProductCatalogue($scope.partnerCatalogue.selected.partnerId);
						$scope
								.typeRegistroCatalogue($scope.partnerCatalogue.selected.partnerId);
					}

					$scope.getLstPartner();

					$scope.validUserAutenticado = function() {
						var valid = false;
						for (var i = 0; i < $rootScope.perfil.length; i++) {
							if ($rootScope.perfil[i].name == namePage) {
								valid = true;
								break;
							}
						}
						if (!valid)
							$location.path($rootScope.perfil[0].name.replace(
									"#", "/"));
					}

					$scope.validUserAutenticado();

					var uploader = $scope.uploader = new FileUploader();

					// a sync filter
					uploader.filters.push({
						name : 'syncFilter',
						fn : function(item /* {File|FileLikeObject} */,
								options) {
							return this.queue.length < 10;
						}
					});

					// an async filter
					uploader.filters.push({
						name : 'asyncFilter',
						fn : function(item /* {File|FileLikeObject} */,
								options, deferred) {
							setTimeout(deferred.resolve, 1e3);
						}
					});

					$scope.errorFechas = true;
					$scope.changeStartDatePe = function() {
						$scope.errorFechas = false;
						if ($scope.startdate != null
								&& $scope.enddate != null
								&& new Date($scope.startdate) > new Date(
										$scope.enddate)) {
							$scope.errorFechas = true
							$scope.errorMsg = "La fecha Periodo desde no puede ser mayor a la fecha  Hasta"
							$('#modalError').modal({
								backdrop : 'static',
								keyboard : false
							})
						}

					}
					
					$scope.eliminarFileSelect = function (item){
						item.remove();
						$('INPUT[type="file"]').val('');
					}
					
					$scope.archivoInvalid = true;

					$('INPUT[type="file"]')
							.change(
									function() {
										$scope.archivoInvalid = false;
										var ext = this.value
												.substring(this.value
														.lastIndexOf("."));
										switch (ext) {
										case '.txt':
										case '.TXT':
											break;
										default:

											$scope.errorMsg = "La extensión del archivo debe ser .txt"
											$('#modalError').modal({
												backdrop : 'static',
												keyboard : false
											});

											$scope.archivoInvalid = true;
										}
									});

					// CALLBACKS

					uploader.onWhenAddingFileFailed = function(
							item /* {File|FileLikeObject} */, filter, options) {
						console.info('onWhenAddingFileFailed', item, filter,
								options);
					};
					uploader.onAfterAddingFile = function(fileItem) {
						console.info('onAfterAddingFile', fileItem);
					};
					uploader.onAfterAddingAll = function(addedFileItems) {
						console.info('onAfterAddingAll', addedFileItems);
					};
					uploader.onBeforeUploadItem = function(item) {
						console.info('onBeforeUploadItem', item);
					};
					uploader.onProgressItem = function(fileItem, progress) {
						console.info('onProgressItem', fileItem, progress);
					};
					uploader.onProgressAll = function(progress) {
						console.info('onProgressAll', progress);
					};
					uploader.onSuccessItem = function(fileItem, response,
							status, headers) {
						console.info('onSuccessItem', fileItem, response,
								status, headers);
					};
					uploader.onErrorItem = function(fileItem, response, status,
							headers) {
						console.info('onErrorItem', fileItem, response, status,
								headers);
					};
					uploader.onCancelItem = function(fileItem, response,
							status, headers) {
						console.info('onCancelItem', fileItem, response,
								status, headers);
					};
					uploader.onCompleteItem = function(fileItem, response,
							status, headers) {
						console.info('onCompleteItem', fileItem, response,
								status, headers);
					};
					uploader.onCompleteAll = function() {
						console.info('onCompleteAll');
					};
				})

		.controller(
				'navigationController',
				function($rootScope, $scope, $http, $location, $window) {
					$rootScope.authenticated = false;
					$rootScope.userName = null;
					$rootScope.photo = null;
					$rootScope.admin = false;

					var authenticate = function(credentials, callback) {
						$
								.blockUI({
									css : {
										border : 'none',
										padding : '15px',
										backgroundColor : '#000',
										'-webkit-border-radius' : '10px',
										'-moz-border-radius' : '10px',
										opacity : .5,
										color : '#fff'
									},
									message : '<i class="fa fa-spinner fa-pulse fa-3x fa-fw"></i>Validando usuario...'
								});
						var headers = credentials ? {
							authorization : "Basic "
									+ btoa(credentials.username + ":"
											+ credentials.password)
						} : {};

						$http
								.get('user', {
									headers : headers
								})
								.success(
										function(data) {
											if (data.name != null) {
												if (data.principal.exito) {
													$rootScope.authenticated = true;
													$rootScope.userName = data.principal.username;
													$rootScope.photo = data.principal.photo;
													$rootScope.perfil = [];
													$rootScope.perfil = data.principal.menu;
													var roleAdmin = false;
													for (i = 0; i < data.authorities.length; i++) {
														if (data.authorities[i].authority == 'ROLE_ADMIN') {
															roleAdmin = true;
															break;
														}
													}
													$rootScope.roleAdmin = roleAdmin;
												} else {
													$rootScope.authenticated = false;
													$rootScope.userName = null;
													$rootScope.photo = null;
												}
											}
											$.unblockUI();
											callback && callback();
										}).error(function() {
									$rootScope.authenticated = false;
									$rootScope.userName = null;
									callback && callback();
								});
					}

					$scope.logout = function() {
						$http.post('logout', {}).success(function() {
							$rootScope.authenticated = false;
							$rootScope.userName = null;
							$location.path("/login");
						}).error(function(data) {
							$rootScope.authenticated = false;
							$rootScope.userName = null;
						});
					}

					authenticate();
					$scope.credentials = {};

					$scope.login = function() {
						authenticate($scope.credentials, function() {
							if ($rootScope.authenticated) {
								$location.path($rootScope.perfil[0].name
										.replace("#", "/"));
								$scope.error = false;
							} else {
								$location.path("/login");
								$scope.error = true;
							}
						});
					};

				});
