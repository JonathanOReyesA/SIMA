package mx.com.gentera.seguros.common.zip.services;

import java.io.IOException;
import java.util.Map;

import org.springframework.core.io.Resource;

public interface IZipService {

	void createZip(Resource[] resources, String zipFileName) throws IOException;

	void createZip(String zipFileName, Map<String, String> mapDataValue) throws IOException;

}
