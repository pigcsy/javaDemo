package com.thirdmore;

/**
 * Created by maven on 2017/1/5.
 */
public class Bighead {

    public static void main(String[] args) {
        老婆 myWife = 老婆.marryMe();
        System.out.println("老婆，首先我想对你说：" + myWife);

        System.out.println("如果你笑，");
        if (myWife.笑()) {
            System.out.println("我更加高兴。\r");
        }

        System.out.println("如果你哭，");
        if (myWife.哭()) {
            System.out.println("我哄你笑。\r");
        }

        if (myWife.不在家()) {
            System.out.println("我就很难入睡。\r");
        }

        System.out.println("生活中难免有琐碎、摩擦。");
        try {
            myWife.生气了();
        } catch (老婆很生气Exception e) {
            System.out.println(e.getMessage());
            System.out.println("都是我的错，是我不好。请老婆不要生气。");
        } finally {
            System.out.println("直到....");
            myWife.破涕为笑();
            // 为了空行
            System.out.println();
        }

        int myAge = 28;
        // 爱你一万年
        while (myAge <= 10028) {
            boolean 我是否爱你 = true;
            myAge++;
        }

        System.out.println("希望能就这样平平静静的牵你手，一直走。");
        System.out.println("我爱你，我的老婆。");
        System.exit(0


        );
    }

    // 老婆是私有，全局唯一，不可更改继承的
    private static final class 老婆 {

        // 老婆，\r 代表换行
        private static final String 漂亮等级 = "世界上最美丽的\r";
        private static final String 温柔等级 = "世界上最温柔的\r";
        private static final String 勤劳等级 = "世界上最勤劳的\r";
        private static final String 善良等级 = "世界上最善良的\r";
        private static final String 可爱等级 = "世界上最可爱的\r";
        private static final String 懂我等级 = "世界上最懂我的\r";
        private static final String 疼我等级 = "世界上最疼我的\r";
        private static final String 照顾我等级 = "世界上最精心照顾我的\r";
        private static final String 对我的意义 = "你是我一生最爱的人\r";

        // 老婆是不能构造的，只能迎娶
        private 老婆() {
        }

        private static final 老婆 marryMe() {
            return new 老婆();
        }

        private boolean 笑() {
            System.out.println("老婆笑了：)");
            return true;
        }

        private boolean 哭() {
            System.out.println("呜呜，老婆伤心了。");
            return true;
        }

        private boolean 不在家() {
            System.out.println("老婆不在家。");
            return true;
        }

        private void 生气了() {
            throw new 老婆很生气Exception("老婆今天很生气，不爱理你。");
        }

        private void 破涕为笑() {
            System.out.println("老婆破涕为笑。");
        }

        @Override
        public String toString() {
            return "老婆你是：\r" + 漂亮等级 + 温柔等级 + 勤劳等级 + 善良等级 + 可爱等级
                    + "你也是：\r" + 懂我等级 + 疼我等级 + 照顾我等级 + "总之，\r" + 对我的意义;
        }

    }

    /*
     * 老婆很生气异常
     */
    private static final class 老婆很生气Exception extends RuntimeException {

        private static final long serialVersionUID = 7260098074598571319L;

        private 老婆很生气Exception(String msg) {
            super(msg);
        }
    }

}

