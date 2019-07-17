package ac.kr.ajou.dirt2;

import java.util.HashSet;
import java.util.Set;

public class SingleIpIdentificationBuilder implements IdentificationBuilder {

    @Override
    public Set<String> buildCombinedIdentification(PcBangEvent pbe) {
        Set<String> identification = new HashSet<>();
        if (pbe.getIp() != null) {
            identification.add(pbe.getIp());
        }
        return identification;
    }
}
