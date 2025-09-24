/**
 * Simple test runner for individual classes.
 */
public class TestRunner 
{
    public static void main(String[] args) 
    {
        if (args.length == 0) {
            System.out.println("Usage: java TestRunner <classname>");
            System.out.println("Available classes: ZufallszahlenTester, MapTester, SortierenTest, BeantworterErweitert");
            return;
        }
        
        String className = args[0];
        
        switch (className) {
            case "ZufallszahlenTester":
                ZufallszahlenTester zt = new ZufallszahlenTester();
                zt.alleMethodenTesten();
                break;
                
            case "MapTester":
                MapTester mt = new MapTester();
                mt.alleFunktionenTesten();
                break;
                
            case "SortierenTest":
                SortierenTest st = new SortierenTest();
                st.alleFunktionenTesten();
                break;
                
            case "BeantworterErweitert":
                BeantworterErweitert be = new BeantworterErweitert();
                be.alleFunktionenTesten();
                break;
                
            case "KundendienstsystemDemo":
                KundendienstsystemVollstaendig ks = new KundendienstsystemVollstaendig();
                ks.startenMitModus("demo");
                break;
                
            default:
                System.out.println("Unknown class: " + className);
                break;
        }
    }
}