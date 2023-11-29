package mx.com.gentera.seguros.sima.web.security;

public class Menu {

	public String name;
	public String image;
	public String descripcion;
	public int num;

	public Menu(String name, String image, String descripcion, int num) {
		super();
		this.name = name;
		this.image = image;
		this.descripcion = descripcion;
		this.num = num;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Menu [name=" + name + ", image=" + image + ", descripcion=" + descripcion + ", num=" + num + "]";
	}

}
