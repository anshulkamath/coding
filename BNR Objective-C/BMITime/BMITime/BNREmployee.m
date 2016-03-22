//
//  BNREmployee.m
//  BMITime
//
//  Created by Anshul Kamath on 4/6/15.
//  Copyright (c) 2015 ChoppSopht LLC. All rights reserved.
//

#import "BNREmployee.h"
#import "BNRAsset.h"

// This is a class extension
@interface BNREmployee ()
{
    NSMutableSet *_assets;
}

@property (nonatomic) unsigned int OfficeAlarmCode;

@end

@implementation BNREmployee

//Accessors for assets properties
- (void)setAssets:(NSArray *)a
{
    _assets = [a mutableCopy];
}

- (NSArray *)assets
{
    return [_assets copy];
}

- (void)addAsset:(BNRAsset *)a
{
    //Is asset nil?
    if(!_assets)
    {
        _assets = [[NSMutableSet alloc] init];
    }
    [_assets addObject:a];
    a.holder = self;
}

- (unsigned int)valueOfAssets
{
    //Sum of the resale value of the assets
    unsigned int sum = 0;
    for (BNRAsset *a in _assets) {
        sum += [a resaleValue];
    }
    return sum;
}


- (double) yearsOfEmployment
{
    //Do I have a non-nil hireDate?
    if (self.hireDate)
    {
        //NSTime is the same as double
        NSDate *now = [NSDate date];
        NSTimeInterval secs = [now timeIntervalSinceDate:self.hireDate];
        return secs / 31557600.0; //Seconds per year
    }
    else
    {
        return 0;
    }
}
- (float)bodyMassIndex
{
    float normalBMI = [super bodyMassIndex];
    return normalBMI * 0.9;
}

- (NSString *)description
{
    return [NSString stringWithFormat:@"<Employee %d>", self.employeeID];
}

@end
