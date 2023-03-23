package metier;
import dao.IDao;
public class MetierImpl implements IMetier{
    IDao dao;
    @Override
    public double calcul(){
        double d = dao.getData();
        return d*2021;
    }
    public void setDao(IDao dao){
        this.dao = dao;
    }

}
