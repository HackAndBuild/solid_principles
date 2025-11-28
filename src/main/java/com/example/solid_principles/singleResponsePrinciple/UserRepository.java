package com.example.solid_principles.singleResponsePrinciple;

class UserRepository {
    //single response
    public void saveUser(User user) {
        System.out.println("User " + user.getName() + " saved to database.");
    }
}

