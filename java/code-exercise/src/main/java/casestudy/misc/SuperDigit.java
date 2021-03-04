package casestudy.misc;

public class SuperDigit {
    public static void main(String[] arg) {
        String n =
                "740495400969422744624637574722785221369257089071788474049540096942274462463757472278522136925708907178847404954009694227446246375747227852213692570890717884174001587537145838723390362624487926131161112710589127423098959327020544003395792482625191721603328307774998124389641069884634086849138515079220750462317357487762780480576640689175346956135668451835480490089962406773267569650663927778867764315211280625033388271518264961090111547480467065229843613873499846390257375933040086863430523668050046930387013897062106309406874425001127890574986610018093859693455518413268914361859000614904461902442822577552997680098389183082654625098817411306985010658756762152160904278169491634807464356130877526392725432086439934006728914411061861235300979536190100734360684054557448454640750198466877185875290011114667186730452681943043971812380628117527172389889545776779555664826488520325234792648448625225364535053605515386730925070072896004645416713682004600636574389040662827182696337187610904694029221880801372864040345567230941110986028568372710970460116491983700312243090679537497139499778923997433720159174153";
        int k = 10000;

        int sumStr = superDigit(n, k);
        System.out.println("superDigitStr: " + sumStr);
    }

    static int superDigit(String n, int k) {
        String pStr = getPStr(n, k);
        return sd(pStr, pStr.length());
    }

    static String getPStr(String n, int k) {
        for (int i = 0; i < k - 1; i++)
            n.concat(n);
        return n;
    }

    static int sd(String n, int len) {
        if (n == null || n == "" || n.isEmpty() || len == 0)
            return 0;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += Character.getNumericValue(n.charAt(i));
        }
        if (sum / 10 != 0) {
            return sd(String.valueOf(sum), String.valueOf(sum).length());
        } else
            return sum;
    }

}
