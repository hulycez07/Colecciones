import java.util.ArrayList;


public class Personaje {

	private String nombre;
	private ArrayList<String> skills;
	private ArrayList<String> items;
	
	public Personaje(String nombre){
		this.nombre=nombre;
		skills=new ArrayList<String>();
		items=new ArrayList<String>();
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<String> getAllSkills() {
		return skills;
	}
	
	public String getSkills(int index){
		return skills.get(index);
	}
	
	public void setSkills(String skills) {
		this.skills.add(skills);
	}
	
	public ArrayList<String> getAllItems() {
		return items;
	}
	
	public String getItem(int index){
		return items.get(index);
	}
	
	public void setItem(String item) {
		this.items.add(item);
	}


	public String toString() {
		return "Nombre="+nombre + " Skills="+skills+ " Items="+items;
	}
	

	
	
}
