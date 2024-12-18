package org.javaacademy.core.homework.homework2.office;

public class Secretary {
    public static final String SPEECH_PATTERN = "%s не волнуйтесь, %s все успеет.\n" +
            "%s - подождите!";


    public void toAsk(Manager manager, Boss boss, Guard guard) {
            String secretarySpeech = SPEECH_PATTERN.formatted(boss.getName(),
                    manager.getName(), guard.getName());
        System.out.println(secretarySpeech);
//1вар.     System.out.println(boss.getName() + " Не волнуйтесь, " + manager.getName()
//        + "всё успеет!");
//2вар.     System.out.printf("%s не волнуйтесь, %s все успеет. " +
//             "%s - подождите!", boss.getName(), manager.getName(), guard.getName());
    }
}

