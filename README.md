# Vectors-Skript
A simple addon that adds vectors to the Skript-Language.

Main page: [SkUnity.com] (https://forums.skunity.com/t/10690)

Creating a new vector:
```
[new] vector [(from|at|to)] %number%,[ ]%number%(,[ ]| and )%number%
[new] vector from yaw %number% and pitch %number%
vector (of|from|to) %location%
%location%['s] vector
vector (from|between) %location% (to|and) %location%
random vector
[new] cylindrical vector [from|with] [radius] %number%, [yaw] %number%(,| and) [height] %number%
[new] spherical vector [from|with] [radius] %number%, [yaw] %number%(,| and) [pitch] %number%
```

Vector arithmetic:
```
%vector% ++ %vector%
%vector% -- %vector%
%vector% ** %vector%
%vector% // %vector%
```

Note: Numbers are automatically converted to vectors!
The following syntaxes is valid and should be used to multiply and divide vectors by a number:
```
set {_v} to vector 1, 2, 3 // 5
```

Offset a location by a vector:
```
%location% ~ %vector%
```

Getting a vector from a location:
```
vector (of|from|to) %location%
```

Converting a vector to a location:
```
%vector% [to location] [in] %world%
location (from|of) %vector% [(from|in)] %world%
%vector% [to location] [in] %world% with yaw %number% and pitch %number%
location (from|of) %vector% [(in|from)] %world% with yaw %number% and pitch %number%
```

Properties of vectors:
```
(x|y|z) of %vector%
vector (yaw|pitch) of %vector%
length of %vector%
%vector%['s] length%
squared length of %vector%
%vector%['s] squared length
```

Rotating a vector:
```
rotate %vector% around %vector% by %number% [degrees]
rotate %vector% around (x|y|z)(-| )axis by %number% [degrees]
```

Some other expressions:
```
angle between %vector% and %vector%
normalize %vector%
%vector% normalized
%vector% cross %vector%
%vector% dot %vector%
```
