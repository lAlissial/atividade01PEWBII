package br.com.ifpb.si.pwebii.atividade01qst10.questao.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class MegaSena {
    private int quantidade;
    private List<Integer> numeros_aleatorios = new ArrayList<Integer>();

    
    public void geraNumerosAleatorios(){
        int validos = this.numeros_aleatorios.size();
        Random random = new Random();

        
        for(int j=0; j < quantidade; j++){
            int aleatorio = random.nextInt(61);
            for (int i=0; i < quantidade; i++){
                if (aleatorio == this.numeros_aleatorios.get(i) && i != j){
                    aleatorio = random.nextInt(61);
                } else {
                    this.numeros_aleatorios.add(aleatorio);
                }
            }
        }
        Collections.sort(this.numeros_aleatorios);
    }
}
