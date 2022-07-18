package com.technicalnews.model;

interface Movement {
    public void run();
    public void jump();
}
class Dog implements Movement {
    public void run() {
        System.out .println("This dog can run a long time!");
    }

    @Override
    public void jump() {
        System.out.println("This dog can't jump very high!");
    }
}

class Cat implements Movement {
    public void run(){
        System.out.println("This cat can run really fast!");
    }

    public void jump() {
        System.out.println("This cat can jump really high!");
    }
}
