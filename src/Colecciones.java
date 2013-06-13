import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class Colecciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Personaje> listaPersonajes =new ArrayList<Personaje>();
		
		listaPersonajes.add(new Personaje("Mario"));
		listaPersonajes.get(0).setItem("Estrellita");
		listaPersonajes.get(0).setSkills("Brincar");
		
		for(Personaje p:listaPersonajes){
			System.out.println(p.toString());
		}
		
		/*//List<String> equipo=new LinkedList();
		List<String> equipo=new LinkedList<String>();
		equipo.add("Mario");
		equipo.add("Luigui");
		equipo.add("Pincesita");
		
		for(String e:equipo){
			System.out.println(e);
		}
		
		ListIterator<String> it=equipo.listIterator();
		//Iterator it=equipo.iterator();
		
		String primero=(String) it.next();
		System.out.println(primero);
		String segundo=(String) it.next();
		System.out.println(segundo);
		//it.remove();*/
		
		/*List<String> lista=new ArrayList<String>();
		
		lista.add("Mario");
		lista.add("Luigui");
		lista.add("Princesita");
		
		for(String obj: lista){
			System.out.println(obj);
		}
		
		System.out.println();
		
		String personaje = null;
		for(String obj: lista){
			if(obj.equals("Princesita")){
				personaje=obj;
			}
		}
		
		lista.remove(personaje);
		
		for(String obj: lista){
			System.out.println(obj);
		}*/
		
	

	}

}
