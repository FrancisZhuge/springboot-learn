package com.francis.chapter34;

public class LinuxListService implements ListService{
    @Override
    public String showListCmd() {
        return "ls";
    }
}
