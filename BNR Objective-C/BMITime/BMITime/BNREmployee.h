//
//  BNREmployee.h
//  BMITime
//
//  Created by Anshul Kamath on 4/6/15.
//  Copyright (c) 2015 ChoppSopht LLC. All rights reserved.
//

#import "BNRPerson.h"
@class BNRAsset;

@interface BNREmployee : BNRPerson


@property (nonatomic) unsigned int employeeID;
@property (nonatomic) NSDate *hireDate;
@property (nonatomic, copy ) NSSet *assets;
- (double) yearsOfEmployment;
- (void)addAsset:(BNRAsset *)a;
- (unsigned int)valueOfAssets;

@end
