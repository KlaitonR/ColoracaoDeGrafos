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
		
		Aresta a6 = new Aresta();
		a6.origem = v4;
		a6.destino = v1;
		v4.adj.add(v1);
		v1.adj.add(v4);
		conjuntoE.add(a6);
		
		for(int i=0;i<conjuntoV.size();i++){ // calcula o grau do vertice
			for(int j=0;j<conjuntoV.get(i).adj.size();j++){
				
					conjuntoV.get(i).adj.get(j).grau += 1;
				}
			}
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
		int verf = 0;
		
		while(decrescente.size()<tamanhoV) { // preenche a lista com os vertices em ordem decrescente
			decrescente.add(listaDecrescente(aux, conjuntoVoriginal));
		}
		
		
		
		decrescente.get(0).horario = horarios.get(0);
		
		contHorario++;
		
		for(int i=0;i<decrescente.size();i++) {
			for(int j=0;j<decrescente.get(0).adj.size();j++) {
				if(decrescente.get(i).label != decrescente.get(0).label) {
					if(decrescente.get(i).label == decrescente.get(0).adj.get(j).label) {
						verf++;
					}
				}
			}
			
			if(verf==0) {
				decrescente.get(i).horario = horarios.get(0);
				break;
			}
			
		}
		
		int verfNull = 0;
		
		for(int i=0;i<decrescente.size();i++) {
			for(int j=0;j<decrescente.get(i).adj.size();j++) {
				if(decrescente.get(i).horario == null) {
					if(decrescente.get(i).adj.get(j).horario!= null) {
						verfNull++;
					}
				}
			}
			
			if(verfNull == 0) {
				decrescente.get(i).horario = horarios.get(0);
			}
		}
		
		
		
		while(verificaHorario(decrescente)!=0) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		int contDec = decrescente.size();
	
		for(int i=0;i<contDec;i++) {
			
			//verf = false;
			for(int x=0;x<decrescente.get(i).adj.size();x++) {
			if(decrescente.get(i).horario == null) { //pega o primeiro vertice da lista decrescente e adiciona a primeira cor
				
				decrescente.get(i).horario = horarios.get(contHorario);
				verf += 1; //Indica que um novo horario precisa ser alocado
			
				preencheNaoAdj(decrescente.get(i), decrescente, horarios, contHorario);
			
				for(int j=0;j<decrescente.size();j++) {
					if(decrescente.get(j).horario == null) {
						preencheNaoAdj(decrescente.get(j), decrescente, horarios, contHorario);
					}
				}
			
			
		
				if(verf>0) { //Indica que um novo horario presa ser alocado
					contHorario += 1; //muda a possisam do horario, pois esse já foi pego
				}
			
			}
		}
		}
		
		*/
		
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
	
	static public void preencheNaoAdj(Vertice v, ArrayList<Vertice> decrescente, ArrayList<String> horarios, int contHorario) {
		
		
		for(int i=0;i<decrescente.size();i++) {
			
			int op = 0;

			if(decrescente.get(i).horario == null) {
				if(v.label != decrescente.get(i).label) {
					// verifica se pode pintar
					for(int j=0;j<v.adj.size();j++) { //pega os adjacentes do vertice analisado
				
							if(v.adj.get(j).label.equals(decrescente.get(i).label)) { //verifica se é adjacente do vertice analisado
								op+=1; //se for, soma um, pois não será pintado
							}	
							
							
						}
					
					if(op==0) {
						int op2 = 0;
						
						if(decrescente.get(i).horario == null) {
							
							for(int k=0;k<decrescente.get(i).adj.size();k++) {
								if(decrescente.get(i).adj.get(k).horario == v.horario)
									op2+=1;
							}	
						}
						
						if(op2==0)
							decrescente.get(i).horario = horarios.get(contHorario);
					}
					
				}
			/*	
			if(op==0) {
				if(decrescente.get(i).horario == null) {
					op+=1;
					int op2 = 0;
					for(int k=0;k<decrescente.get(i).adj.size();k++) {
						if(decrescente.get(i).adj.get(k).horario == v.horario)
							op2+=1;
					}
				
					if(op2==0)
						decrescente.get(i).horario = horarios.get(contHorario);
					
				}
			}
			*/
		}
		}
		
		JOptionPane.showMessageDialog(null, horarios.get(contHorario));
	}
	
	static public int verificaHorario(ArrayList<Vertice> decrescente) {
		
		int op = 0;
		
		for(int i=0;i<decrescente.size();i++) {
			if(decrescente.get(i).horario == null) {
				op++;
			}
		}
		
		return op;
	}
	

}
