---
title: Core Paragraph Formatter Test Spec
author: Vladimir Schneider
version: 1.0
date: '2019-12-17'
license: '[CC-BY-SA 4.0](http://creativecommons.org/licenses/by-sa/4.0/)'
...

---

# Paragraph Formatter

## Wrap

```````````````````````````````` example(Wrap: 1) options(margin[66])
Add: configuration for repeated prefixes in items, which would `be #2` copied when adding/splitting an item. In other words they
    would be treated equivalent to task item marker prefix. That way
    standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes would be automatically copied.  
.
⟦Add: configuration for repeated prefixes in items, which would `be⟧
⟦#2` copied when adding/splitting an item. In other words they
⟧⟦would be treated equivalent to task item marker prefix. That way
⟧⟦standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes⟧
⟦would be automatically copied.⟧

---- Result ------------------------------------------------------------
Add: configuration for repeated prefixes in items, which would `be
#2` copied when adding/splitting an item. In other words they
would be treated equivalent to task item marker prefix. That way
standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes
would be automatically copied.
````````````````````````````````


```````````````````````````````` example(Wrap: 2) options(margin[66])
Add: configuration for repeated prefixes in items, which would `be #2`        ⦙copied when adding/splitting an item. In other words they
    would be treated equivalent to task item marker prefix. That way
    standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes would be automatically copied.  
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [78) } --> 71

---- Ranges ------------------------------------------------------------
⟦Add: configuration for repeated prefixes in items, which would `be⟧
⟦#2` ⟧⟦copied when adding/splitting an item. In other words they
⟧⟦would be treated equivalent to task item marker prefix. That way
⟧⟦standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes⟧
⟦would be automatically copied.⟧

---- Result ------------------------------------------------------------
Add: configuration for repeated prefixes in items, which would `be
#2` ⦙copied when adding/splitting an item. In other words they
would be treated equivalent to task item marker prefix. That way
standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes
would be automatically copied.
````````````````````````````````


```````````````````````````````` example(Wrap: 3) options(margin[66], delete-space)
Add: configuration for repeated prefixes in items, which would `be #2` copied when adding/splitting an item. In other words they
⟦    ⟧⦙would be treated equivalent to task item marker prefix. That way
⟦    ⟧standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes would be automatically copied.  
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [133, s, d) } --> 128

---- Ranges ------------------------------------------------------------
⟦Add: configuration for repeated prefixes in items, which would `be⟧
⟦#2` copied when adding/splitting an item. In other words they⟧⟦would⟧
⟦be treated equivalent to task item marker prefix. That way
⟧⟦standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes⟧
⟦would be automatically copied.⟧

---- Result ------------------------------------------------------------
Add: configuration for repeated prefixes in items, which would `be
#2` copied when adding/splitting an item. In other words they⦙would
be treated equivalent to task item marker prefix. That way
standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes
would be automatically copied.
````````````````````````````````


```````````````````````````````` example(Wrap: 4) options(margin[66], delete-space, indent[    ], first-indent[], first-width-delta[0])
Add: configuration for repeated prefixes in items, which would `be #2` copied when adding/splitting an item. In other words they
⟦    ⟧⦙would be treated equivalent to task item marker prefix. That way
⟦    ⟧standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes would be automatically copied.  
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [133, s, d) } --> 136

---- Ranges ------------------------------------------------------------
⟦Add: configuration for repeated prefixes in items, which would `be⟧
   ⟦ #2` copied when adding/splitting an item. In other words⟧
   ⟦ they⟧⟦would be treated equivalent to task item marker prefix.⟧
   ⟦ That way⟧⟦ standard: `Add: `, `Fix: `, `Break: ` and `Deprecate:⟧
   ⟦ ` prefixes would be automatically copied.⟧

---- Result ------------------------------------------------------------
Add: configuration for repeated prefixes in items, which would `be
    #2` copied when adding/splitting an item. In other words
    they⦙would be treated equivalent to task item marker prefix.
    That way standard: `Add: `, `Fix: `, `Break: ` and `Deprecate:
    ` prefixes would be automatically copied.
````````````````````````````````


```````````````````````````````` example(Wrap: 5) options(margin[66], delete-space, indent[    > ], first-width-delta[0])
Add: configuration for repeated prefixes in items, which would `be #2` copied when adding/splitting an item. In other words they
⟦    ⟧⦙would be treated equivalent to task item marker prefix. That way
⟦    ⟧standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes would be automatically copied.  
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [133, s, d) } --> 146

---- Ranges ------------------------------------------------------------
⟦⟧    > ⟦Add: configuration for repeated prefixes in items, which⟧
    >⟦ would `be #2` copied when adding/splitting an item. In other⟧
    >⟦ words they⟧⟦would be treated equivalent to task item marker⟧
    >⟦ prefix. That way⟧⟦ standard: `Add: `, `Fix: `, `Break: ` and⟧
    >⟦ `Deprecate: ` prefixes would be automatically copied.⟧

---- Result ------------------------------------------------------------
    > Add: configuration for repeated prefixes in items, which
    > would `be #2` copied when adding/splitting an item. In other
    > words they⦙would be treated equivalent to task item marker
    > prefix. That way standard: `Add: `, `Fix: `, `Break: ` and
    > `Deprecate: ` prefixes would be automatically copied.
````````````````````````````````


```````````````````````````````` example(Wrap: 6) options(margin[66], delete-char)
Add: configuration for repeated prefixes in items, which would `be #2` copied when adding/splitting an item. In other words they
⟦    ⟧⦙would be treated equivalent to task item marker prefix. That way
⟦    ⟧standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes would be automatically copied.  
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [133, d) } --> 129

---- Ranges ------------------------------------------------------------
⟦Add: configuration for repeated prefixes in items, which would `be⟧
⟦#2` copied when adding/splitting an item. In other words they
⟧⟦would be treated equivalent to task item marker prefix. That way
⟧⟦standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes⟧
⟦would be automatically copied.⟧

---- Result ------------------------------------------------------------
Add: configuration for repeated prefixes in items, which would `be
#2` copied when adding/splitting an item. In other words they
⦙would be treated equivalent to task item marker prefix. That way
standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes
would be automatically copied.
````````````````````````````````


```````````````````````````````` example(Wrap: 7) options(margin[66], restore-tracked-spaces)
Add: configuration for repeated prefixes in items, which would `be #2` copied when adding/splitting an item. In other words they
⟦    ⟧⦙would be treated equivalent to task item marker prefix. That way
⟦    ⟧standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes would be automatically copied.   ⦙  
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [133) } --> 129
[1]: { [300) } --> 292

---- Ranges ------------------------------------------------------------
⟦Add: configuration for repeated prefixes in items, which would `be⟧
⟦#2` copied when adding/splitting an item. In other words they
⟧⟦would be treated equivalent to task item marker prefix. That way
⟧⟦standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes⟧
⟦would be automatically copied.⟧   ⟦⟧

---- Result ------------------------------------------------------------
Add: configuration for repeated prefixes in items, which would `be
#2` copied when adding/splitting an item. In other words they
⦙would be treated equivalent to task item marker prefix. That way
standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes
would be automatically copied.   ⦙
````````````````````````````````


```````````````````````````````` example(Wrap: 8) options(margin[66], restore-tracked-spaces)
Add: configuration for repeated prefixes in items, which would `be #2` copied when adding/splitting an item. In other words they
⟦    ⟧⦙would be treated equivalent to task item marker prefix. That way
⟦    ⟧standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes would be automatically copied.   ⦙   ⦙   
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [133) } --> 129
[1]: { [300) } --> 292
[2]: { [303) } --> 295

---- Ranges ------------------------------------------------------------
⟦Add: configuration for repeated prefixes in items, which would `be⟧
⟦#2` copied when adding/splitting an item. In other words they
⟧⟦would be treated equivalent to task item marker prefix. That way
⟧⟦standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes⟧
⟦would be automatically copied.⟧      ⟦⟧

---- Result ------------------------------------------------------------
Add: configuration for repeated prefixes in items, which would `be
#2` copied when adding/splitting an item. In other words they
⦙would be treated equivalent to task item marker prefix. That way
standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes
would be automatically copied.   ⦙   ⦙
````````````````````````````````


```````````````````````````````` example(Wrap: 9) options(margin[66], restore-tracked-spaces)
Add: configuration for repeated prefixes in items, which would `be #2` copied when adding/splitting an item. In other words they
⟦    ⟧⦙would be treated equivalent to task item marker prefix. That way  ⦙
⟦    ⟧standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes would be automatically copied.   ⦙   ⦙   
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [133) } --> 129
[1]: { [199) } --> 195
[2]: { [302) } --> 294
[3]: { [305) } --> 297

---- Ranges ------------------------------------------------------------
⟦Add: configuration for repeated prefixes in items, which would `be⟧
⟦#2` copied when adding/splitting an item. In other words they
⟧⟦would be treated equivalent to task item marker prefix. That way  
⟧⟦standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes⟧
⟦would be automatically copied.⟧      ⟦⟧

---- Result ------------------------------------------------------------
Add: configuration for repeated prefixes in items, which would `be
#2` copied when adding/splitting an item. In other words they
⦙would be treated equivalent to task item marker prefix. That way  ⦙
standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes
would be automatically copied.   ⦙   ⦙
````````````````````````````````


```````````````````````````````` example(Wrap: 10) options(margin[66], restore-tracked-spaces)
  ⦙ Add: configuration for repeated prefixes in items, which would `be #2` copied when adding/splitting an item. In other words they
⟦    ⟧⦙would be treated equivalent ⦙ to task item marker prefix. That way  ⦙
⟦    ⟧standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes would be automatically copied.   ⦙   ⦙   
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [2) } --> 0
[1]: { [136) } --> 129
[2]: { [164) } --> 157
[3]: { [203) } --> 196
[4]: { [306) } --> 295
[5]: { [309) } --> 298

---- Ranges ------------------------------------------------------------
⟦Add: configuration for repeated prefixes in items, which would `be⟧
⟦#2` copied when adding/splitting an item. In other words they
⟧⟦would be treated equivalent  to task item marker prefix. That way  
⟧⟦standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes⟧
⟦would be automatically copied.⟧      ⟦⟧

---- Result ------------------------------------------------------------
⦙Add: configuration for repeated prefixes in items, which would `be
#2` copied when adding/splitting an item. In other words they
⦙would be treated equivalent ⦙ to task item marker prefix. That way  ⦙
standard: `Add: `, `Fix: `, `Break: ` and `Deprecate: ` prefixes
would be automatically copied.   ⦙   ⦙
````````````````````````````````


```````````````````````````````` example(Wrap: 11) options(margin[66])
Add: configuration ⦙ for repeated
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [19) } --> 19

---- Ranges ------------------------------------------------------------
⟦Add: configuration ⟧⟦for repeated⟧

---- Result ------------------------------------------------------------
Add: configuration ⦙for repeated
````````````````````````````````


```````````````````````````````` example(Wrap: 12) options(margin[66], restore-tracked-spaces)
Add: configuration ⦙ for repeated
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [19) } --> 19

---- Ranges ------------------------------------------------------------
⟦Add: configuration  for repeated⟧

---- Result ------------------------------------------------------------
Add: configuration ⦙ for repeated
````````````````````````````````


```````````````````````````````` example(Wrap: 13) options(margin[66], restore-tracked-spaces)
Add: configuration ⦙ for repeated.  ⦙  ⦙  
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [19) } --> 19
[1]: { [35) } --> 35
[2]: { [37) } --> 37

---- Ranges ------------------------------------------------------------
⟦Add: configuration  for repeated.⟧    ⟦⟧

---- Result ------------------------------------------------------------
Add: configuration ⦙ for repeated.  ⦙  ⦙
````````````````````````````````


backspace after typing 1 char should preserve surrounding spaces

```````````````````````````````` example(Wrap: 14) options(margin[66], delete-char, restore-tracked-spaces)
Add: configuration ⦙ for repeated.
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [19, d) } --> 19

---- Ranges ------------------------------------------------------------
⟦Add: configuration  for repeated.⟧

---- Result ------------------------------------------------------------
Add: configuration ⦙ for repeated.
````````````````````````````````


```````````````````````````````` example(Wrap: 15) options(margin[66], restore-tracked-spaces)
Add: configuration for repeated. ⦙ ➥[simLink](simLink.md)
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [33) } --> 33

---- Ranges ------------------------------------------------------------
⟦Add: configuration for repeated.⟧ ⟦⟧
⟦[simLink](simLink.md)⟧

---- Result ------------------------------------------------------------
Add: configuration for repeated. ⦙
[simLink](simLink.md)
````````````````````````````````


```````````````````````````````` example(Wrap: 16) options(margin[66], insert-space, restore-tracked-spaces)
Add: configuration for repeated.
 ⦙➥[simLink](simLink.md)
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [34, s) } --> 33

---- Ranges ------------------------------------------------------------
⟦Add: configuration for repeated.⟧ ⟦
⟧⟦[simLink](simLink.md)⟧

---- Result ------------------------------------------------------------
Add: configuration for repeated. ⦙
[simLink](simLink.md)
````````````````````````````````


```````````````````````````````` example(Wrap: 17) options(margin[66], insert-char, restore-tracked-spaces)
Add: configuration for repeated.
t⦙➥[simLink](simLink.md)
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [34) } --> 34

---- Ranges ------------------------------------------------------------
⟦Add: configuration for repeated.⟧ ⟦t⟧
⟦[simLink](simLink.md)⟧

---- Result ------------------------------------------------------------
Add: configuration for repeated. t⦙
[simLink](simLink.md)
````````````````````````````````


```````````````````````````````` example(Wrap: 18) options(margin[30], insert-char, restore-tracked-spaces)
text should wrap onto the next t⦙
line at right margin of 30
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [32) } --> 32

---- Ranges ------------------------------------------------------------
⟦text should wrap onto the next⟧
⟦t⟧ ⟦line at right margin of 30⟧

---- Result ------------------------------------------------------------
text should wrap onto the next
t⦙ line at right margin of 30
````````````````````````````````


```````````````````````````````` example(Wrap: 19) options(margin[32], insert-char, restore-tracked-spaces)
text should wrap onto the next tt⦙
line at right margin of 30
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [33) } --> 33

---- Ranges ------------------------------------------------------------
⟦text should wrap onto the next⟧
⟦tt⟧ ⟦line at right margin of 30⟧

---- Result ------------------------------------------------------------
text should wrap onto the next
tt⦙ line at right margin of 30
````````````````````````````````


```````````````````````````````` example(Wrap: 20) options(margin[32], delete-char, restore-tracked-spaces)
text should wrap onto the next
t⦙ line at right margin of 30
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [32, d) } --> 32

---- Ranges ------------------------------------------------------------
⟦text should wrap onto the next⟧ ⟦t⟧
⟦line at right margin of 30⟧

---- Result ------------------------------------------------------------
text should wrap onto the next t⦙
line at right margin of 30
````````````````````````````````


```````````````````````````````` example(Wrap: 21) options(margin[30], insert-space, restore-tracked-spaces)
text should wrap onto the next ⦙.
line at right margin of 30
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [31, s) } --> 31

---- Ranges ------------------------------------------------------------
⟦text should wrap onto the next⟧
⟦.⟧ ⟦line at right margin of 30⟧

---- Result ------------------------------------------------------------
text should wrap onto the next
⦙. line at right margin of 30
````````````````````````````````


```````````````````````````````` example(Wrap: 22) options(margin[32], insert-space, restore-tracked-spaces)
text should wrap onto the next ⦙\\. 
line at right margin of 30
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [31, s) } --> 31

---- Ranges ------------------------------------------------------------
⟦text should wrap onto the next⟧
⟦\\. ⟧⟦line at right margin of 30⟧

---- Result ------------------------------------------------------------
text should wrap onto the next
⦙\\. line at right margin of 30
````````````````````````````````


```````````````````````````````` example(Wrap: 23) options(margin[96], delete-char, restore-tracked-spaces, indent[      ], first-indent[* [ ] ])
⟦* [ ] ⟧Fix: remove formatter and use flexmark formatter for document format to eliminate the need
⟦      ⟧⦙ keep duplicate code.
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [103, d) } --> 97

---- Ranges ------------------------------------------------------------
⟦* [ ] Fix: remove formatter and use flexmark formatter for document format to eliminate the need⟧ ⟦
⟧⟦      keep duplicate code.⟧

---- Result ------------------------------------------------------------
* [ ] Fix: remove formatter and use flexmark formatter for document format to eliminate the need ⦙
      keep duplicate code.
````````````````````````````````


```````````````````````````````` example(Wrap: 24) options(margin[96], insert-space, restore-tracked-spaces, indent[      ], first-indent[* [ ] ])
⟦* [ ] ⟧Fix: remove formatter and use flexmark formatter for document format to eliminate the need
⟦      ⟧ ⦙to keep duplicate code.
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [104, s) } --> 103

---- Ranges ------------------------------------------------------------
⟦* [ ] Fix: remove formatter and use flexmark formatter for document format to eliminate the need
⟧⟦      to keep duplicate code.⟧

---- Result ------------------------------------------------------------
* [ ] Fix: remove formatter and use flexmark formatter for document format to eliminate the need
      ⦙to keep duplicate code.
````````````````````````````````


```````````````````````````````` example(Wrap: 25) options(margin[96], insert-space, restore-tracked-spaces, indent[      ], first-indent[* [ ] ])
⟦* [ ] ⟧Fix: remove formatter and use flexmark formatter for document format to eliminate the need ⦙ to keep duplicate code.
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [97, s) } --> 97

---- Ranges ------------------------------------------------------------
⟦* [ ] Fix: remove formatter and use flexmark formatter for document format to eliminate the need⟧ ⟦⟧
    ⟦  to keep duplicate code.⟧

---- Result ------------------------------------------------------------
* [ ] Fix: remove formatter and use flexmark formatter for document format to eliminate the need ⦙
      to keep duplicate code.
````````````````````````````````


```````````````````````````````` example(Wrap: 26) options(margin[96], insert-space, restore-tracked-spaces, indent[  ], first-indent[* ])
⟦* ⟧Fix: conversion from Smart to based to extract more source information from segmented
⟦  ⟧sequence ⦙and mapped sequence.
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [99, s) } --> 99

---- Ranges ------------------------------------------------------------
⟦* Fix: conversion from Smart to based to extract more source information from segmented⟧⟦ sequence⟧
 ⟦ and mapped sequence.⟧

---- Result ------------------------------------------------------------
* Fix: conversion from Smart to based to extract more source information from segmented sequence
  ⦙and mapped sequence.
````````````````````````````````


```````````````````````````````` example(Wrap: 27) options(margin[96], insert-space, restore-tracked-spaces, indent[  ], first-indent[* ])
⟦* ⟧Fix: wrap on typing caret adjustment on space after non-space and before keep at start of line elements. ⦙
.
---- Tracked Offsets ---------------------------------------------------
[0]: { [107, s) } --> 109

---- Ranges ------------------------------------------------------------
⟦* Fix: wrap on typing caret adjustment on space after non-space and before keep at start of line⟧
 ⟦ elements.⟧ ⟦⟧

---- Result ------------------------------------------------------------
* Fix: wrap on typing caret adjustment on space after non-space and before keep at start of line
  elements. ⦙
````````````````````````````````


