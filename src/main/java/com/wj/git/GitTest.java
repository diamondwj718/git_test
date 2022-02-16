package com.wj.git;

public class GitTest {
    public static void main(String[] args) {
        System.out.println("Hello git!");
        System.out.println("Hello git2!");
        System.out.println("Hello git3!");
        System.out.println("Hello git4! hot-fix");//与hot-fix分支正常合并
        System.out.println("Hello git5! master");//与hot-fix分支合并发生冲突
        System.out.println("Hello git4! hot-fix");
        System.out.println("Hello git5! hot-fix2");
        System.out.println("Hello git6! test push");
    }
}
