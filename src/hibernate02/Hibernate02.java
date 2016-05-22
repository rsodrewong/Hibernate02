/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author rogerio
 */
public class Hibernate02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PessoaHelper lista = new PessoaHelper();
       ArrayList pessoas = (ArrayList) lista.getList(0, 1000);
       Iterator proximo = pessoas.iterator();
       int i=0;
       while(proximo.hasNext()){
           Pessoa p = (Pessoa) pessoas.get(i);
           System.out.println(p.getNome());
           proximo.next(); 
           i++;
       }
    }
    
}
