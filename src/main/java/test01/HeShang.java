package test01;

import java.util.List;

/**
 * @Acthor:孙琪; date:2019/3/6;
 */
class Miao {
    private String mname;
    private int mage;
    private List<HeShang> heShang;

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public int getMage() {
        return mage;
    }

    public void setMage(int mage) {
        this.mage = mage;
    }

    public List<HeShang> getHeShang() {
        return heShang;
    }

    public void setHeShang(List<HeShang> heShang) {
        this.heShang = heShang;
    }

    public Miao() {
        super();
    }

    public Miao(String mname, int mage, List<HeShang> heShang) {
        this.mname = mname;
        this.mage = mage;
        this.heShang = heShang;
    }

    @Override
    public String toString() {
        return "Miao{" +
                "mname='" + mname + '\'' +
                ", mage=" + mage +
                ", heShang=" + heShang +
                '}';
    }
}
public class HeShang{
    private String hname;
    private int hage;

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public int getHage() {
        return hage;
    }

    public void setHage(int hage) {
        this.hage = hage;
    }

    public HeShang() {
        super();
    }

    public HeShang(String hname, int hage) {
        this.hname = hname;
        this.hage = hage;
    }

    @Override
    public String toString() {
        return "HeShang{" +
                "hname='" + hname + '\'' +
                ", hage=" + hage +
                '}';
    }
}
