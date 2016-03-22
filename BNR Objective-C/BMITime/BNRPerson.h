//
//  BNRPerson.h
//  BMITime
//
//  Created by Anshul Kamath on 4/6/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface BNRPerson : NSObject

//BNRPerson has two properties
@property (nonatomic) float heightInMeters;
@property (nonatomic) float weightInKilos;
//BNRPersonhas a method that calculates the Body Mass Index
-(float)bodyMassIndex;


@end
