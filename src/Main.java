import java.util.ArrayList; 
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Vertice> conjuntoV = new ArrayList<>();
		ArrayList<Aresta> conjuntoE = new ArrayList<>();
		ArrayList<Vertice> conjuntoVoriginal = new ArrayList<>();

		Vertice v1 = new Vertice();
		v1.label = "FF_Terma1";
		
		Vertice v2 = new Vertice();
		v2.label = "FF_Terma2";
		
		Vertice v3 = new Vertice();
		v3.label = "FF_Fatiadeira1";
		
		Vertice v4 = new Vertice();
		v4.label = "FF_Fatiadeira2";
		
		Vertice v5 = new Vertice();
		v5.label = "FP_Moedor_e_misturadeira1";
		
		Vertice v6 = new Vertice(); 
		v6.label = "FP_Moedor_e_misturadeira2";
		
		conjuntoV.add(v1);
		conjuntoV.add(v2);
		conjuntoV.add(v3);
		conjuntoV.add(v4);
		conjuntoV.add(v5);
		conjuntoV.add(v6);
	
		Aresta a1 = new Aresta();
		a1.origem = v1;
		a1.destino = v2;
		v1.adj.add(v2);
		v2.adj.add(v1);
		conjuntoE.add(a1);
		
		Aresta a2 = new Aresta();
		a2.origem = v2;
		a2.destino = v4;
		v2.adj.add(v4);
		v4.adj.add(v2);
		conjuntoE.add(a2);
		
		Aresta a3 = new Aresta();
		a3.origem = v4;
		a3.destino = v3;
		v3.adj.add(v4);
		v4.adj.add(v3);
		conjuntoE.add(a3);
		
		Aresta a4 = new Aresta();
		a4.origem = v3;
		a4.destino = v1;
		v3.adj.add(v1);
		v1.adj.add(v3);
		conjuntoE.add(a4);
		
		Aresta a5 = new Aresta();
		a5.origem = v5;
		a5.destino = v6;
		v5.adj.add(v6);
		v6.adj.add(v5);
		conjuntoE.add(a5);
		
		/*
		Aresta a6 = new Aresta();
		a6.origem = v4;
		a6.destino = v1;
		v4.adj.add(v1);
		v1.adj.add(v4);
		conjuntoE.add(a6);
		*/
	
		/*
		String vertices  = "";
		
		for(int i=0;i<conjuntoV.size();i++) {
			vertices += conjuntoV.get(i).label + " - " + conjuntoV.get(i).horario + " - " + conjuntoV.get(i).grau + "\n";
		}
		
		String arestas = "";
		for(int i=0;i<conjuntoE.size();i++) {
			arestas += "(" + conjuntoE.get(i).origem.label + "," + conjuntoE.get(i).destino.label  + ") \n";	
		}
		
		JOptionPane.showMessageDialog(null, vertices +"\n \n \n "+ arestas);
		
		*/
		
		
		JOptionPane.showMessageDialog(null, welsh_Powell(conjuntoV, conjuntoE, conjuntoVoriginal));
		
		
	}
	
	static public String welsh_Powell(ArrayList<Vertice> conjuntoV,ArrayList<Aresta> conjuntoE, ArrayList<Vertice> conjuntoVoriginal ) {
		
		ArrayList<String> horarios = new ArrayList<>();
		ArrayList<Vertice> semHorarios = new ArrayList<>();

		horarios.add("8:30");
		horarios.add("9:00");
		horarios.add("9:30");
		horarios.add("10:00");
		horarios.add("10:30");
		horarios.add("11:00");
	
		ArrayList<Vertice> decrescente = new ArrayList<>();
		ArrayList<Vertice> aux = new ArrayList<>();
		aux = conjuntoV;
		int tamanhoV = conjuntoV.size();
		int contHorario = 0;
		
		while(decrescente.size()<tamanhoV) { // preenche a lista com os vertices em ordem decrescente
			
			Vertice v = new Vertice();
			
			v = listaDecrescente(aux, conjuntoVoriginal);
			decrescente.add(v);
			semHorarios.add(v);
			
		}
		
		int verfPintado = 0;
		
		for(int i=0;i<decrescente.size();i++) {
			verfPintado = 0 ;
			if(decrescente.get(i).horario == null) {
				for(int j=0;j<decrescente.get(i).adj.size();j++) {
					if(decrescente.get(i).adj.get(j).horario != null) {
						verfPintado++; 
					}
				}
				
				if(verfPintado==0) {
					decrescente.get(i).horario = horarios.get(contHorario);
					semHorarios.remove(decrescente.get(i));
				} 
			}
		}
		
		contHorario++;
		
		while(!semHorarios.isEmpty()) {
			
			int op = semHorarios.size();
			
			for(int i=0;i<op;i++) {
				int verfHorario = 0;
				int op2 = semHorarios.get(i).adj.size();
				for(int j=0;j<op2;j++){
					if(semHorarios.get(i).adj.get(j).horario != horarios.get(contHorario)){
						verfHorario++;
					}
				}
				
				if(verfHorario==0) {
					semHorarios.get(i).horario = horarios.get(contHorario);
					semHorarios.remove(semHorarios.get(i));
				}
				
			}
			
			contHorario++;
		}
		
		
		String vertices  = "";
		
		for(int i=0;i<decrescente.size();i++) {
			vertices += decrescente.get(i).label + " - " + decrescente.get(i).horario + " - " + decrescente.get(i).grau + "\n";
		}
		
		 return vertices;
		
	}
	
	static public Vertice listaDecrescente(ArrayList<Vertice> aux, ArrayList<Vertice> conjuntoVoriginal) {
		
		int maior = -999999999;
		Vertice maiorV =  new Vertice();
		
				for(int i=0;i<aux.size();i++) {
					if(aux.get(i).grau >= maior) {
						maior = aux.get(i).grau;
						maiorV = aux.get(i);
					}   
				}
 				
				aux.remove(maiorV);
				conjuntoVoriginal.add(maiorV);
				return  maiorV;
	}
	
}
