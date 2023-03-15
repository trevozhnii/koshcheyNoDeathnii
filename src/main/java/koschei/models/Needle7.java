package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + deth8.toString();
    }

    private Deth8 deth8;

    @Autowired
    public void setOcean(Deth8 deth8) {
        this.deth8 = deth8;
    }
}