package mx.com.gentera.seguros.common.zip.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class ZipServiceImpl implements IZipService {
	private static final Logger log = LoggerFactory.getLogger(ZipServiceImpl.class);

	@Override
	public void createZip(Resource[] resources, String zipFileName) throws IOException {

		FileOutputStream fos = new FileOutputStream(zipFileName);
		ZipOutputStream zipOut = new ZipOutputStream(fos);

		log.info("Iniciando compresión de {} archivos en {}", resources.length, zipFileName);

		for (Resource resource : resources) {
			log.info("Comprimiendo archivo {}", resource.getFilename());

			File fileToZip = resource.getFile();
			FileInputStream fis = new FileInputStream(fileToZip);
			ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
			zipOut.putNextEntry(zipEntry);

			final byte[] bytes = new byte[1024];
			int length;
			while ((length = fis.read(bytes)) >= 0) {
				zipOut.write(bytes, 0, length);
			}
			fis.close();
		}
		zipOut.close();
		fos.close();

		log.info("Compresión de archivos finalizada: {}", zipFileName);
	}

	@Override
	public void createZip(String zipFileName, Map<String, String> mapDataValue) throws IOException {

		FileOutputStream fos = new FileOutputStream(zipFileName);
		ZipOutputStream zipOut = new ZipOutputStream(fos);

		log.info("Iniciando compresión de {} archivos en {}", mapDataValue.size(), zipFileName);

		for (Map.Entry<String, String> entry : mapDataValue.entrySet()) {
			String fileName = entry.getKey();
			String dataValue = entry.getValue();

			log.info("Comprimiendo archivo {}", fileName);

			ZipEntry zipEntry = new ZipEntry(fileName);
			zipOut.putNextEntry(zipEntry);
			log.info("Total de Registros en el Archivo " + fileName + " ---> " + dataValue.split("\n").length);

			final byte[] bytes = dataValue.getBytes();
			int length = bytes.length;
			zipOut.write(bytes, 0, length);
		}
		zipOut.close();
		fos.close();

		log.info("Compresión de archivos finalizada: {}", zipFileName);
	}

}