//
//  main.c
//  BMICalc
//
//  Created by Anshul Kamath on 8/11/14.
//  Copyright (c) 2014 ChoppSopht LLC. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>

// Here is the declaration for the type Person
typedef struct {
    float heightInMeters;
    int weightInKilos;
} Person;

float bodyMassIndex (Person *p) {
    return p->weightInKilos / (p->heightInMeters * p->heightInMeters);
};

int main(int argc, const char * argv[]) {
    //Allocate memory for one person struct
    Person *mikey = (Person *)malloc(sizeof(Person));
    
    //Fill in two members of the struct
    mikey->weightInKilos = 96;
    mikey->heightInMeters = 1.7;
    
    //Print out the BMI of the original person
    float mikeyBMI = bodyMassIndex(mikey);
    printf("Mikey has a BMI of %f.\n", mikeyBMI);
    
    //Let the memory be recycled
    free(mikey);
    
    //Forget where it was
    mikey = NULL;
    
    return 0;
}

