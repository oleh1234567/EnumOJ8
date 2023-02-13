package carparts;

import onjava.Enums;

import java.util.Arrays;

public enum Catalogue {
    SUSPENSION(Parts.Suspension.class),
    ENGINE(Parts.Engine.class),
    BODY(Parts.Engine.class),
    TRANSMISSION(Parts.Transmission.class);

    private Parts[] values;

    Catalogue(Class<? extends Parts> type) {
        values = type.getEnumConstants();
    }

    interface Parts{
        enum Suspension implements Parts{
            SILENTBLOCK,
            ARM,
            SPRING,
            SHOCK_ABSORBER,
            TIE_ROD
        }

        enum Engine implements Parts{
            CYLINDER_HEAD,
            CYLINDER_BLOCK,
            GASKETS,
            PISTON,
            CRANKSHAFT,
            CAMSHAFT,
            FLYWHEEL
        }

        enum Body implements Parts{
            FENDER,
            DOOR,
            BOOT,
            WINDSHIELD
        }

        enum Transmission implements Parts{
            SYNCHRONISER ,
            BEARING,
            REVERSE_GEAR

        }
    }

    public Parts randomSelector(){
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            for(Catalogue cat : values()){
                System.out.println(cat + ": " + cat.randomSelector());
            }
            System.out.println("************");
        }
    }
}
