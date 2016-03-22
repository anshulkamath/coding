//
//  BNROwnedAppliance.h
//  Appliances
//
//  Created by Anshul Kamath on 4/8/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#import "BNRAppliance.h"

@interface BNROwnedAppliance : BNRAppliance

@property (readonly) NSSet *ownerNames;

// This is the designated initializer
- (instancetype) initWithProductName:(NSString *)pn
                      firstOwnerName:(NSString *)n;

- (void)addOwnerName:(NSString *)n;
- (void)removeOwnerName:(NSString *)objects;

@end
