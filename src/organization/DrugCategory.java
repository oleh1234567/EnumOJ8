package organization;

import onjava.Enums;

import java.util.Arrays;

enum DrugCategory {
    PAINKILLERS(Drug.Painkillers.class),
    ANTIVIRUS(Drug.Antivirus.class),
    ANTIBIOTICS(Drug.Antibiotics.class);

    Drug[] values;
    DrugCategory(Class<? extends Drug> kind) {
        values = kind.getEnumConstants();
    }

    interface Drug{
        enum Painkillers implements Drug{
            HEROINE,
            IBUPROFEN,
            PARACETAMOL,
            ACETYLSALICYLIC_ACID
        }

        enum Antivirus implements Drug{
            INTERFERON,
            ZANAMAVIR,
            PERAMIVIR
        }

        enum Antibiotics implements Drug{
            PENICILLIN,
            AMOXICILLIN,
            DOXYCYCLINE
        }
    }
    public Drug randomSelection(){
        return Enums.random(values);
    }
}

class TestingDrugs{
    public static void main(String[] args) {
        DrugCategory drug = DrugCategory.PAINKILLERS;

        System.out.println(Arrays.toString(DrugCategory.PAINKILLERS.values));

        for (int i = 0; i < 10; i++) {
            DrugCategory category = Enums.random(DrugCategory.class);
            System.out.println(category + ": " + category.randomSelection());
        }
    }
}
