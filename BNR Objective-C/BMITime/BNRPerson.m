//
//  BNRPerson.m
//  BMITime
//
//  Created by Anshul Kamath on 4/6/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#import "BNRPerson.h"

@implementation BNRPerson

- (float)bodyMassIndex
{
    float h = [self heightInMeters];
    return [self weightInKilos] / (h * h);
}

@end
