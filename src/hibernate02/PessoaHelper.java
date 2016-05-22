/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate02;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author anderson
 */
public class PessoaHelper {
    Session session = null;

    public PessoaHelper() {
        this.session = NovoHibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List getList(int startID, int endID) {
    List<Pessoa> pessoaList = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Pessoa as pessoa where pessoa.indice between '"+startID+"' and '"+endID+"'");
        pessoaList = (List<Pessoa>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return pessoaList;
}
}
