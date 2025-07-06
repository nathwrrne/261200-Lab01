public class Main {
    public static void main(String[] args) {
        Turtle bob = new Turtle();

        bob.penColor("Silver");
        bob.speed(2);
        for (int i = 0; i < 360; i++) {
            bob.forward(3);   // เดินไปข้างหน้า 1 หน่วย
            bob.left(1);      // หมุนซ้าย 1 องศา
        }

        bob.left(90);
        bob.up();
        bob.forward(340);
        bob.down();
        bob.forward(100);
        bob.right(270);

        for(int i = 0; i < 13; i++) {
            if (i % 2 == 0) {
                bob.penColor("Red"); // สีแดง
            } else {
                bob.penColor("white"); // สีขาว
            }

            bob.down();
            bob.backward(70);   // วาดแนวยาวของแถบ
            bob.up();
            bob.forward(70);  // กลับมาจุดเริ่ม
            bob.right(90);
            bob.backward(4);     // เลื่อนลงมา 4 หน่วย (ความสูงแถบ)
            bob.left(90);
        }

        bob.penColor("Black");
        bob.down();
        bob.right(90);
        bob.forward(52);
        bob.right(90);
        bob.forward(70);
        bob.right(90);
        bob.forward(56);
        bob.right(90);
        bob.forward(70);
        bob.right(90);
        bob.forward(16);

        bob.penColor("Dark Blue");
        bob.forward(40);
        bob.right(90);
        bob.forward(40);
        bob.right(90);
        bob.forward(40);
        bob.right(90);
        bob.forward(40);

        bob.up();
        bob.left(90);
        bob.forward(150);
        bob.right(90);
        bob.forward(50);

        bob.penColor("Silver");
        bob.down();

        bob.speed(2);
        for (int i = 0; i < 360; i++) {
            bob.forward(0.5);   // เดินไปข้างหน้า 1 หน่วย
            bob.left(1);      // หมุนซ้าย 1 องศา
        }

        bob.up();
        bob.left(135);
        bob.forward(150);
        bob.down();
        bob.speed(2);
        for (int i = 0; i < 360; i++) {
            bob.forward(0.8);   // เดินไปข้างหน้า 1 หน่วย
            bob.left(1);      // หมุนซ้าย 1 องศา
        }

        bob.up();
        bob.left(270);
        bob.forward(100);
        bob.down();
        bob.speed(2);
        for (int i = 0; i < 360; i++) {
            bob.forward(0.4);   // เดินไปข้างหน้า 1 หน่วย
            bob.left(1);      // หมุนซ้าย 1 องศา
        }

        bob.up();
        bob.left(45);
        bob.forward(150);
        bob.right(90);
        bob.forward(150);

        bob.penColor("Black");
        bob.down();
        bob.right(90);
        bob.forward(50);
        bob.right(135);
        bob.forward(70);
        bob.left(135);
        bob.forward(50);

        bob.up();
        bob.right(180);
        bob.forward(50);
        bob.left(90);
        bob.forward(50);

        bob.down();
        bob.left(60);
        bob.forward(60);
        bob.right(120);
        bob.forward(60);
        bob.backward(20);
        bob.right(120);
        bob.forward(40);

        bob.up();
        bob.backward(40);
        bob.left(180);
        bob.forward(50);
        bob.right(90);
        bob.forward(15);
        bob.left(90);

        bob.down();
        bob.forward(30);
        bob.left(90);
        bob.forward(25);
        bob.left(90);
        bob.forward(30);
        bob.right(90);
        bob.forward(25);
        bob.right(90);
        bob.forward(30);

        bob.up();
        bob.right(90);
        bob.forward(50);
        bob.left(90);
        bob.forward(50);

        bob.down();
        bob.left(60);
        bob.forward(60);
        bob.right(120);
        bob.forward(60);
        bob.backward(20);
        bob.right(120);
        bob.forward(40);

        }



        }
