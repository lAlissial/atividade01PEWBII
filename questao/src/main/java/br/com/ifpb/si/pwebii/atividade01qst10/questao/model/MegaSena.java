package br.com.ifpb.si.pwebii.atividade01qst10.questao.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;

// import org.apache.commons.math3.analysis.function.Identity;

// @Getter
// @Setter
//@AllArgsConstructor
@Data
public class MegaSena {
    // @Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

    private int quantidade;
    private ArrayList<Integer> numeros_aleatorios = new ArrayList<Integer>();

    public void geraNumerosAleatorios(){
        Random random = new Random();

        for(int j=0; j < quantidade; j++){
            int aleatorio = random.nextInt(1,61);
            for (int i=0; i < quantidade; i++){
                if (aleatorio == this.numeros_aleatorios.get(i) && i != j){
                    aleatorio = random.nextInt(1,61);
                } else {
                    this.numeros_aleatorios.add(aleatorio);
                }
            }
        }
        Collections.sort(this.numeros_aleatorios);
    }

    public String printaListaSorteados() {
        return Arrays.toString(this.numeros_aleatorios.toArray());
    }
}
