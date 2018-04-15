package Ayudantia;
import java.util.ArrayList;

public class inventarioObjetos {
	private ArrayList<objetoEquipable> objetos;
	private int max_objetos;
	
	public inventarioObjetos() {
		objetos= new ArrayList<objetoEquipable>();
		max_objetos=10;
	}
	public void agregarObjeto() { //Instancia objeto equipable y lo agrega a objetos
		if (objetos.size()<=max_objetos) { //Limite de luchadores=25
			objetos.add(new objetoEquipable());;
		}	
		else {
			System.out.println("Se ha sobrepasado el l�mite");
		}
	}
	public ArrayList<objetoEquipable> getObjetos() {
		return objetos;
	}
	public void setObjetos(ArrayList<objetoEquipable> objetos) {
		this.objetos = objetos;
	}
	public int getMax_objetos() {
		return max_objetos;
	}
	public void setMax_objetos(int max_objetos) {
		this.max_objetos = max_objetos;
	}
	public void eliminarObjeto(int indice) { //Borra objeto segun indice
		objetos.remove(indice-1);
	}
	
	public void filtro_estrella(int estrella) { //Estrella==rango
		for (int i=0;i<objetos.size();i++) {
			if (objetos.get(i).getEstrella()==estrella) {
				System.out.println("Objeto nro."+ i+"; Estrella: " + estrella);
				break;
			}
		}

	}
	public void mostrar_objetos() {
		for (int i=0;i<objetos.size();i++) {
			System.out.print("Atributo mejorado: "+ objetos.get(i).getHabilidad_mejorada()
					+ "\n Rango/estrella: "+ objetos.get(i).getEstrella() 
					+ "\n Mejora Total: " + objetos.get(i).getMejora());
			
		}
	}
}
