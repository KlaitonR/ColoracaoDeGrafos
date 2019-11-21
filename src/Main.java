import java.util.ArrayList; 
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Vertice> conjuntoV = new ArrayList<>();
		ArrayList<Aresta> conjuntoE = new ArrayList<>();
		ArrayList<Vertice> conjuntoVoriginal = new ArrayList<>();
		
		//SETOR FATIAÇÃO
		
		Vertice v1 = new Vertice();
		v1.label = "FF_Fatiadeira1";
		
		Vertice v2 = new Vertice();
		v2.label = "FF_Fatiadeira 2";
		
		Vertice v3 = new Vertice();
		v3.label = "FF_Fatiadeira 3";
		
		Vertice v4 = new Vertice();
		v4.label = "FF_Fatiadeira 4";
		
		Vertice v5 = new Vertice();
		v5.label = "FF_Terma 1";
		
		Vertice v6 = new Vertice();
		v6.label = "FF_Terma 2";
		
		Vertice v7 = new Vertice();
		v7.label = "FF_Terma 3";
		
		Vertice v8 = new Vertice();
		v8.label = "FF_Embalagem 1";
		
		Vertice v9 = new Vertice();
		v9.label = "FF_Controle de Identificação 1";
		
		Vertice v10 = new Vertice();
		v10.label = "FF_Vácuo 1";
		
		Vertice v11 = new Vertice();
		v11.label = "FF_Vácuo 2";
		
		
		//SETOR EXPEDIÇÃO
		
		Vertice v12 = new Vertice();
		v12.label = "FEX_Expedição 1";
		
		Vertice v13 = new Vertice();
		v13.label = "FEX_Expedição 2";
		
		Vertice v14 = new Vertice();
		v14.label = "FEX_Expedição 3";
		
		//SETOR PRODUÇÃO
	
		Vertice v15 = new Vertice();
		v15.label = "FP_Moedor e Misturadeira 1";
				
		Vertice v16 = new Vertice();
		v16.label = "FP_Moedor e Misturadeira 2";
		
		Vertice v17 = new Vertice();
		v17.label = "FP_Embutimento 1";
		
		Vertice v18 = new Vertice();
		v18.label = "FP_Embutimento 2";
		
		// SETOR DESOSSA
		
		Vertice v19 = new Vertice();
		v19.label = "Funcionário Embalagem 2";
		
		Vertice v20 = new Vertice();
		v20.label = "Funcionário Embalagem 3";
		
		Vertice v21 = new Vertice();
		v21.label = "Funcionário Desossa 1";
		
		Vertice v22 = new Vertice();
		v22.label = "Funcionário Desossa 2";
		
		Vertice v23 = new Vertice();
		v23.label = "Funcionário Desossa 3";
		
		Vertice v24 = new Vertice();
		v24.label = "Funcionário Desossa 4";
		
		Vertice v25 = new Vertice();
		v25.label = "Funcionário Desossa 5";
		
		Vertice v26 = new Vertice();
		v26.label = "Funcionário Serra 1";
		
		Vertice v27 = new Vertice();
		v27.label = "Funcionário Controle de Identificação";
		
		//SETOR DEFUMAÇÃO
		
		Vertice v28 = new Vertice();
		v28.label = "Funcionário Defumação 1";
		
		Vertice v29 = new Vertice();
		v29.label = "Funcionário Defumação 2";
		
		//SETOR INJETOURA
		
		Vertice v30 = new Vertice();
		v30.label = "Funcionário Injetora 1";
		
		Vertice v31 = new Vertice();
		v31.label = "Funcionário Injetora 2";
		
		//SETOR LIMPEZA
		
		Vertice v32 = new Vertice();
		v32.label = "Funcionário Limpeza 1";
		
		Vertice v33 = new Vertice();
		v33.label = "Funcionário Limpeza 2";
		
	
		conjuntoV.add(v1);
		conjuntoV.add(v2);
		conjuntoV.add(v3);
		conjuntoV.add(v4);
		conjuntoV.add(v5);
		conjuntoV.add(v6);
		conjuntoV.add(v7);
		conjuntoV.add(v8);
		conjuntoV.add(v9);
		conjuntoV.add(v10);
		conjuntoV.add(v11);
		conjuntoV.add(v12);
		conjuntoV.add(v13);
		conjuntoV.add(v14);
		conjuntoV.add(v15);
		conjuntoV.add(v16);
		conjuntoV.add(v17);
		conjuntoV.add(v18);
		conjuntoV.add(v19);
		conjuntoV.add(v20);
		conjuntoV.add(v21);
		conjuntoV.add(v22);
		conjuntoV.add(v23);
		conjuntoV.add(v24);
		conjuntoV.add(v25);
		conjuntoV.add(v26);
		conjuntoV.add(v27);
		conjuntoV.add(v28);
		conjuntoV.add(v29);
		conjuntoV.add(v30);
		conjuntoV.add(v31);
		conjuntoV.add(v32);
		conjuntoV.add(v33);
		
		//SETOR EMBALAGEM
		
		Aresta a1 = new Aresta();
		a1.origem = v1;
		a1.destino = v2;
		v1.adj.add(v2);
		v2.adj.add(v1);
		conjuntoE.add(a1);
		
		Aresta a2 = new Aresta();
		a2.origem = v1;
		a2.destino = v3;
		v1.adj.add(v3);
		v3.adj.add(v1);
		conjuntoE.add(a2);
		
		Aresta a3 = new Aresta();
		a3.origem = v1;
		a3.destino = v4;
		v1.adj.add(v4);
		v4.adj.add(v1);
		conjuntoE.add(a3);
		
		Aresta a4 = new Aresta();
		a4.origem = v5;
		a4.destino = v7;
		v5.adj.add(v7);
		v7.adj.add(v5);
		conjuntoE.add(a4);
		
		Aresta a5 = new Aresta();
		a5.origem = v5;
		a5.destino = v6;
		v5.adj.add(v6);
		v6.adj.add(v5);
		conjuntoE.add(a5);
		
		Aresta a6 = new Aresta();
		a6.origem = v6;
		a6.destino = v2;
		v6.adj.add(v2);
		v2.adj.add(v6);
		conjuntoE.add(a6);
		
		Aresta a7 = new Aresta();
		a7.origem = v6;
		a7.destino = v4;
		v6.adj.add(v4);
		v4.adj.add(v6);
		conjuntoE.add(a7);
		
		Aresta a8 = new Aresta();
		a8.origem = v8;
		a8.destino = v9;
		v8.adj.add(v9);
		v9.adj.add(v8);
		conjuntoE.add(a8);
		
		Aresta a9 = new Aresta();
		a9.origem = v8;
		a9.destino = v10;
		v8.adj.add(v10);
		v10.adj.add(v8);
		conjuntoE.add(a9);
		
		Aresta a10 = new Aresta();
		a10.origem = v2;
		a10.destino = v10;
		v2.adj.add(v10);
		v10.adj.add(v2);
		conjuntoE.add(a10);
		
		Aresta a11 = new Aresta();
		a11.origem = v10;
		a11.destino = v4;
		v10.adj.add(v4);
		v4.adj.add(v10);
		conjuntoE.add(a11);
		
		Aresta a12 = new Aresta();
		a12.origem = v10;
		a12.destino = v11;
		v10.adj.add(v11);
		v11.adj.add(v10);
		conjuntoE.add(a12);
		
		Aresta a13 = new Aresta();
		a13.origem = v10;
		a13.destino = v11;
		v10.adj.add(v11);
		v11.adj.add(v10);
		conjuntoE.add(a13);
		
		//SETOR EMBALAGEM DESOSSA
		
		Aresta a14 = new Aresta();
		a14.origem = v8;
		a14.destino = v19;
		v8.adj.add(v19);
		v19.adj.add(v8);
		conjuntoE.add(a14);
		
		//SETOR EXPEDIÇÃO
		
		Aresta a15 = new Aresta();
		a15.origem = v12;
		a15.destino = v13;
		v12.adj.add(v13);
		v13.adj.add(v12);
		conjuntoE.add(a15);
		
		Aresta a16 = new Aresta();
		a16.origem = v12;
		a16.destino = v14;
		v12.adj.add(v14);
		v14.adj.add(v12);
		conjuntoE.add(a16);
		
		//SETOR EXPEDIÇÃO EMBALAGEM
		
		Aresta a17 = new Aresta();
		a17.origem = v13;
		a17.destino = v9;
		v13.adj.add(v9);
		v9.adj.add(v13);
		conjuntoE.add(a17);
		
		Aresta a18 = new Aresta();
		a18.origem = v14;
		a18.destino = v9;
		v14.adj.add(v9);
		v9.adj.add(v14);
		conjuntoE.add(a18);
		
		//SETOR EEXPEDIÇÃO DESOSSA
		
		Aresta a19 = new Aresta();
		a19.origem = v12;
		a19.destino = v27;
		v12.adj.add(v27);
		v27.adj.add(v12);
		conjuntoE.add(a19);
		
		//SETOR PRODUÇÃO
		
		Aresta a20 = new Aresta();
		a20.origem = v15;
		a20.destino = v16;
		v15.adj.add(v16);
		v16.adj.add(v15);
		conjuntoE.add(a20);
		
		Aresta a21 = new Aresta();
		a21.origem = v17;
		a21.destino = v18;
		v17.adj.add(v18);
		v18.adj.add(v17);
		conjuntoE.add(a21);
		
		Aresta a22 = new Aresta();
		a22.origem = v15;
		a22.destino = v17;
		v15.adj.add(v17);
		v17.adj.add(v15);
		conjuntoE.add(a22);
		
		Aresta a23 = new Aresta();
		a23.origem = v15;
		a23.destino = v18;
		v15.adj.add(v18);
		v18.adj.add(v15);
		conjuntoE.add(a23);
		
		Aresta a24 = new Aresta();
		a24.origem = v15;
		a24.destino = v18;
		v15.adj.add(v18);
		v18.adj.add(v15);
		conjuntoE.add(a24);
		
		//SETOR DESSOSA
		
		Aresta a25 = new Aresta();
		a25.origem = v19;
		a25.destino = v20;
		v19.adj.add(v20);
		v20.adj.add(v19);
		conjuntoE.add(a25);
		
		Aresta a26 = new Aresta();
		a26.origem = v21;
		a26.destino = v22;
		v21.adj.add(v22);
		v22.adj.add(v21);
		conjuntoE.add(a26);
		
		Aresta a27 = new Aresta();
		a26.origem = v21;
		a26.destino = v23;
		v21.adj.add(v23);
		v23.adj.add(v21);
		conjuntoE.add(a27);
		
		Aresta a28 = new Aresta();
		a28.origem = v24;
		a28.destino = v25;
		v24.adj.add(v25);
		v25.adj.add(v24);
		conjuntoE.add(a28);
		
		Aresta a29 = new Aresta();
		a29.origem = v24;
		a29.destino = v22;
		v24.adj.add(v22);
		v22.adj.add(v24);
		conjuntoE.add(a29);
		
		Aresta a30 = new Aresta();
		a30.origem = v24;
		a30.destino = v23;
		v24.adj.add(v23);
		v23.adj.add(v24);
		conjuntoE.add(a30);
		
		Aresta a31 = new Aresta();
		a31.origem = v19;
		a31.destino = v21;
		v19.adj.add(v21);
		v21.adj.add(v19);
		conjuntoE.add(a31);
		
		Aresta a32 = new Aresta();
		a32.origem = v19;
		a32.destino = v22;
		v19.adj.add(v22);
		v22.adj.add(v19);
		conjuntoE.add(a32);
		
		Aresta a33 = new Aresta();
		a33.origem = v26;
		a33.destino = v22;
		v26.adj.add(v22);
		v22.adj.add(v26);
		conjuntoE.add(a33);
		
		//SETOR DESSOSA PRODUÇÃO
		
		Aresta a34 = new Aresta();
		a34.origem = v22;
		a34.destino = v15;
		v22.adj.add(v15);
		v15.adj.add(v22);
		conjuntoE.add(a34);
		
		//SETOR DEFUMAÇÃO
		
		Aresta a35 = new Aresta();
		a35.origem = v28;
		a35.destino = v29;
		v28.adj.add(v29);
		v29.adj.add(v28);
		conjuntoE.add(a35);
		
		//SETOR DEFUMAÇÃO PRODUÇÃO
		
		Aresta a36 = new Aresta();
		a36.origem = v28;
		a36.destino = v15;
		v28.adj.add(v15);
		v15.adj.add(v28);
		conjuntoE.add(a36);
		
		//SETOR INJETORA
		
		Aresta a37 = new Aresta();
		a37.origem = v30;
		a37.destino = v31;
		v30.adj.add(v31);
		v31.adj.add(v30);
		conjuntoE.add(a37);
		
		//SETOR INJETOERA DESOSSA
		
		Aresta a38 = new Aresta();
		a38.origem = v30;
		a38.destino = v24;
		v30.adj.add(v24);
		v24.adj.add(v30);
		conjuntoE.add(a38);
		
		//SETOR INJETORA DEFUMAÇÃO
		
		Aresta a39 = new Aresta();
		a39.origem = v30;
		a39.destino = v28;
		v30.adj.add(v28);
		v28.adj.add(v30);
		conjuntoE.add(a39);
		
		//SETOR LIMPEZA
		
		Aresta a40 = new Aresta();
		a40.origem = v32;
		a40.destino = v33;
		v32.adj.add(v33);
		v33.adj.add(v32);
		conjuntoE.add(a40);
		
		for(int i=0;i<conjuntoV.size();i++){ // calcula o grau do vertice
			for(int j=0;j<conjuntoV.get(i).adj.size();j++){

					conjuntoV.get(i).adj.get(j).grau += 1;
				}
			}
		
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
				
			Vertice v = listaDecrescente(aux, conjuntoVoriginal);
			decrescente.add(v);
			semHorarios.add(v);
		}
		
		int verfHorario = 0; //Primeira parte do algoritmo
		
		for(int i=0;i<decrescente.size();i++) {
			verfHorario = 0 ;
			if(decrescente.get(i).horario == null) {
				for(int j=0;j<decrescente.get(i).adj.size();j++) {
					
					if(decrescente.get(i).adj.get(j).horario == horarios.get(contHorario)) {
						verfHorario++; 
					}	
				}
				
				if(verfHorario==0) {
					decrescente.get(i).horario = horarios.get(contHorario);
					semHorarios.remove(decrescente.get(i));
				} 
			}
		}
		
		contHorario++; //Segunda parte do algoritmo
		
		while(!semHorarios.isEmpty()) {

			int verfHorario2 = 0;
			int op2 = semHorarios.size();
			
			if(op2!=0) {
				for(int i=0;i<semHorarios.size();i++) {
					verfHorario2 = 0;
				 
					for(int j=0;j<semHorarios.get(i).adj.size();j++) {
						if(semHorarios.get(i).adj.get(j).horario == horarios.get(contHorario)){
							verfHorario2++;
						}
					}
				
				if(verfHorario2==0) {
					semHorarios.get(i).horario = horarios.get(contHorario);
				}
				
				}   
			}
		
			int op = semHorarios.size();
			int y=0;
			
			while (op>0) {
				
				op = 0;

				if(semHorarios.get(y).horario != null) {
					semHorarios.remove(y); 
					y--;
				}
				
				int op3 = semHorarios.size();
				
				if(op3!=0) {
					for(int i=0;i<semHorarios.size();i++) {
						if(semHorarios.get(i).horario != null){
							op++;
						}
					}
				}
				
				y++;	
				
			}
			
			contHorario++;

		}
		
		String vertices  = "RESULTADOS - Número de horários necessários : "
				+ contHorario + "\n Horário para cada funcionário: \n" ;
		
		for(int i=0;i<decrescente.size();i++) {
			vertices += decrescente.get(i).label + " - " + decrescente.get(i).horario + "\n";
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
