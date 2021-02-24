package helpers;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import pojos.Dept;
import pojos.HibernateUtil;

public class HelperDepartamentos {

    Session session;

    public HelperDepartamentos() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public List<Dept> getDepartamentos() {
        //siempre que realizamos consultas hql se deben hacer mediante una transacción
        this.session.beginTransaction();
        String hql = "from Dept as dept";
        //las consultas de selección se resuelven con objetos query
        Query q = this.session.createQuery(hql);
        //esto ya tiene la colección de la consulta hql creada
        return q.list();
    }
}
