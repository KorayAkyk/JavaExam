package korayakyurek.Service;

import korayakyurek.Model.Salarie;
import org.hibernate.Query;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

public class SalarieService implements Serializable {

    public boolean create(Salarie c, Session s) {
        s.save(c);
        return true;
    }

    public void delete(Session s, int id) {
        SalarieService c = s.get(SalarieService.class, id);
        s.delete(c);
    }

    public void update(Session s, int id) {
        Salarie c = s.get(Salarie.class, id);
        c.setNom("AKYUREK");
        s.update(c);
    }

    public Salarie findById(Session s, int id) {
        Salarie c = s.get(Salarie.class, id);
        return c;
    }

    public List<Salarie> findAll(Session s) {
        Query q = s.createQuery("from Salarie");
        List<Salarie> listeC = q.list();

        return listeC;
    }

}
