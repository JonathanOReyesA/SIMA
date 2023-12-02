package mx.com.gentera.seguros.sima.web.security;

public class Menu {

	public String name;
	public String image;
	public String descripcion;
	public int num;

	public Menu(String name, String img, String desc, int num) {
		this.name = name;
		this.image = img;
		this.descripcion = desc;
		this.num = num;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Menu [name=" + name + ", image=" + image + ", descripcion=" + descripcion + ", num=" + num + "]";
	}

}
