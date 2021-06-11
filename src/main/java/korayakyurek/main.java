package korayakyurek;

import korayakyurek.Model.DirecteurService;
import korayakyurek.Model.SalarieService;
import org.hibernate.Session;

import java.util.Comparator;

public class main {

    public static void main(String[] args) {
        SalarieService salarieService = new SalarieService();
        DirecteurService directeurService = new DirecteurService();

        Directeur directeurA = new Directeur();
        directeurA.setNom("AKYUREK");
        directeurA.setPrenom("KORAY");

        Salarie salarie1 = new Salarie();
        salarie1.setIdDirecteur(directeur1);
        salarie1.setNom("MICHEL");
        salarie1.setPrenom("MICHEL");
        salarie1.setSalaire(450000);

        Salarie salarie2 = new Salarie();
        salarie2.setIdDirecteur(directeur1);
        salarie2.setNom("MICHOU");
        salarie2.setPrenom("MICHOU");
        salarie2.setSalaire(60000);

        Salarie salarie3 = new Salarie();
        salarie3.setIdDirecteur(directeurA);
        salarie3.setNom("ANGELINE");
        salarie3.setPrenom("MAMA");
        salarie3.setSalaire(600045250);


        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        directeurService.create(directeurA, session);
        salarieService.create(salarie1, session);
        salarieService.create(salarie2, session);
        Salarie maxSalaire = salarieService.findAll(session).stream().
                max(Comparator.comparingDouble(Salarie::getSalaire)).get();
        System.out.println("Le plus gros salaire est donc : " + maxSalaire.getSalaire());

    }


}
