//
//  main.c
//  ClassCertificates
//
//  Created by Anshul Kamath on 8/10/14.
//  Copyright (c) 2014 ChoppSopht LLC. All rights reserved.
//

#include <stdio.h>
#include <unistd.h>
void congratulateStudent (char *student, char *course, int numDays) {
        printf("%s has done as much %s Programming as I could fit into %d days.", student, course, numDays);
    }

int main(int argc, const char * argv[]) {
    congratulateStudent("Kate", "Cocoa", 5);
    sleep(2);
    congratulateStudent("Bo", "Objective-C", 2);
    sleep(2);
    congratulateStudent("Mike", "Python", 5);
    sleep(2);
    congratulateStudent("Liz", "iOS", 5);
    
    return 0;
}

