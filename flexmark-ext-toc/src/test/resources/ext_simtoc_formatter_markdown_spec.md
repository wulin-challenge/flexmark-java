---
title: SimToc Extension Formatter Spec
author: Vladimir Schneider
version: 0.9.0
date: '2019-12-21'
license: '[CC-BY-SA 4.0](http://creativecommons.org/licenses/by-sa/4.0/)'
...

---

# SimToc

## No Spacer

### Unordered

Default rendering with emphasis

```````````````````````````````` example No Spacer - Unordered: 1
[TOC]:#  

# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
.
[TOC]: #
# Table of Contents
- [Heading 1.1 _some italic_](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)
  - [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)

# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Default rendering with div class

```````````````````````````````` example(No Spacer - Unordered: 2) options(div-class)
[TOC]:#  

# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
.
[TOC]: #
# Table of Contents
- [Heading 1.1 _some italic_](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)
  - [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)

# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Default rendering with div class, list class

```````````````````````````````` example(No Spacer - Unordered: 3) options(div-class, list-class)
[TOC]:#  

# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
.
[TOC]: #
# Table of Contents
- [Heading 1.1 _some italic_](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)
  - [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)

# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Default rendering with list class

```````````````````````````````` example(No Spacer - Unordered: 4) options(list-class)
[TOC]:#  

# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
.
[TOC]: #
# Table of Contents
- [Heading 1.1 _some italic_](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)
  - [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)

# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


start with missing first level

```````````````````````````````` example No Spacer - Unordered: 5
[TOC levels=1-6]:#  


## Header 1
# Header 2
### Header 3
## Header 4
# Header 5
.
[TOC levels=1-6]: #
# Table of Contents
- [Header 1](#header-1)
- [Header 2](#header-2)
  - [Header 3](#header-3)
  - [Header 4](#header-4)
- [Header 5](#header-5)


## Header 1

# Header 2

### Header 3

## Header 4

# Header 5

````````````````````````````````


start with missing first 2 levels

```````````````````````````````` example No Spacer - Unordered: 6
[TOC levels=1-6]:#  


### Header 1
## Header 2
### Header 3
# Header 4
.
[TOC levels=1-6]: #
# Table of Contents
- [Header 1](#header-1)
- [Header 2](#header-2)
  - [Header 3](#header-3)
- [Header 4](#header-4)


### Header 1

## Header 2

### Header 3

# Header 4

````````````````````````````````


Text only style

```````````````````````````````` example No Spacer - Unordered: 7
[TOC text]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC text]: #
# Table of Contents
- [Heading 1.1 some italic](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)
  - [Heading 1.1.2  some bold italic](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text and inlines style

```````````````````````````````` example(No Spacer - Unordered: 8) options(text-only)
[TOC format]:#  


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC formatted]: #
# Table of Contents
- [Heading 1.1 _some italic_](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)
  - [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text only, flat

```````````````````````````````` example(No Spacer - Unordered: 9) options(text-only, flat)
[TOC]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC]: #
# Table of Contents
- [Heading 1.1 some italic](#heading-11-some-italic)
- [Heading 1.1.1](#heading-111)
- [Heading 1.1.2  some bold italic](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text and inlines, flat

```````````````````````````````` example(No Spacer - Unordered: 10) options(flat)
[TOC]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC]: #
# Table of Contents
- [Heading 1.1 _some italic_](#heading-11-some-italic)
- [Heading 1.1.1](#heading-111)
- [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text and inlines, hierarchy

```````````````````````````````` example(No Spacer - Unordered: 11) options(flat)
[TOC hierarchy]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC hierarchy]: #
# Table of Contents
- [Heading 1.1 _some italic_](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)
  - [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text and inlines, flat

```````````````````````````````` example(No Spacer - Unordered: 12) options(flat-reversed)
[TOC]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1

.
[TOC]: #
# Table of Contents
- [Heading 1.1.1](#heading-111)
- [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)
- [Heading 1.1 _some italic_](#heading-11-some-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

````````````````````````````````


Text and inlines, flat-reversed

```````````````````````````````` example(No Spacer - Unordered: 13) options(flat-reversed)
[TOC]:#


# Heading **some bold** 1
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
## Heading 1.1 _some italic_

.
[TOC]: #
# Table of Contents
- [Heading 1.1 _some italic_](#heading-11-some-italic)
- [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)
- [Heading 1.1.1](#heading-111)


# Heading **some bold** 1

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

## Heading 1.1 _some italic_

````````````````````````````````


Text only, sorted

```````````````````````````````` example(No Spacer - Unordered: 14) options(text-only, sorted)
[TOC]:#


## Heading 1.1 _some italic_
# Heading **some bold** 1
### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1

.
[TOC]: #
# Table of Contents
- [Heading 1.1 some italic](#heading-11-some-italic)
- [Heading 1.1.1](#heading-111)
- [Heading 1.1.2  some bold italic](#heading-112--some-bold-italic)


## Heading 1.1 _some italic_

# Heading **some bold** 1

### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

````````````````````````````````


Text and inlines, sorted

```````````````````````````````` example(No Spacer - Unordered: 15) options(sorted)
[TOC]:#


### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1
## Heading 1.1 _some italic_
# Heading **some bold** 1

.
[TOC]: #
# Table of Contents
- [Heading 1.1 _some italic_](#heading-11-some-italic)
- [Heading 1.1.1](#heading-111)
- [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

## Heading 1.1 _some italic_

# Heading **some bold** 1

````````````````````````````````


Text only, sorted

```````````````````````````````` example(No Spacer - Unordered: 16) options(text-only, sorted-reversed)
[TOC]:#


## Heading 1.1 _some italic_
# Heading **some bold** 1
### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1

.
[TOC]: #
# Table of Contents
- [Heading 1.1.2  some bold italic](#heading-112--some-bold-italic)
- [Heading 1.1.1](#heading-111)
- [Heading 1.1 some italic](#heading-11-some-italic)


## Heading 1.1 _some italic_

# Heading **some bold** 1

### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

````````````````````````````````


Text and inlines, sorted reversed

```````````````````````````````` example(No Spacer - Unordered: 17) options(sorted-reversed)
[TOC]:#


### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1
## Heading 1.1 _some italic_
# Heading **some bold** 1

.
[TOC]: #
# Table of Contents
- [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)
- [Heading 1.1.1](#heading-111)
- [Heading 1.1 _some italic_](#heading-11-some-italic)


### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

## Heading 1.1 _some italic_

# Heading **some bold** 1

````````````````````````````````


Text and inlines, unsorted

```````````````````````````````` example(No Spacer - Unordered: 18) options(sorted)
[TOC hierarchy]:#


### Heading 1.1.2  **_some bold italic_**
## Heading 1.1 _some italic_
### Heading 1.1.1
# Heading **some bold** 1

.
[TOC hierarchy]: #
# Table of Contents
- [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)
- [Heading 1.1 _some italic_](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)


### Heading 1.1.2  **_some bold italic_**

## Heading 1.1 _some italic_

### Heading 1.1.1

# Heading **some bold** 1

````````````````````````````````


Typographic chars included

```````````````````````````````` example(No Spacer - Unordered: 19) options(sorted)
[TOC hierarchy]:#


### Heading's 1.1.2  **_some bold italic_**
## Heading 1.1 _some italic_
### Heading 1.1.1
# Heading **some bold** 1

.
[TOC hierarchy]: #
# Table of Contents
- [Heading's 1.1.2  **_some bold italic_**](#headings-112--some-bold-italic)
- [Heading 1.1 _some italic_](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)


### Heading's 1.1.2  **_some bold italic_**

## Heading 1.1 _some italic_

### Heading 1.1.1

# Heading **some bold** 1

````````````````````````````````


With Typographic extension included

```````````````````````````````` example(No Spacer - Unordered: 20) options(typographic)
[TOC hierarchy]:#


### Heading's 1.1.2  **_some bold italic_**
## Heading 1.1 _some italic_
### Heading 1.1.1
# Heading **some bold** 1

.
[TOC]: #
# Table of Contents
- [Heading's 1.1.2  **_some bold italic_**](#headings-112--some-bold-italic)
- [Heading 1.1 _some italic_](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)


### Heading's 1.1.2  **_some bold italic_**

## Heading 1.1 _some italic_

### Heading 1.1.1

# Heading **some bold** 1

````````````````````````````````


```````````````````````````````` example(No Spacer - Unordered: 21) options(github)
[TOC hierarchy]:#


### Heading_add
## Heading2_add_more

.
[TOC]: #
# Table of Contents
- [Heading_add](#heading_add)
- [Heading2_add_more](#heading2_add_more)


### Heading_add

## Heading2_add_more

````````````````````````````````


### Ordered

Default rendering with emphasis

```````````````````````````````` example(No Spacer - Ordered: 1) options(numbered)
[TOC]:#  

# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
.
[TOC]: #
# Table of Contents
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)
   1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)

# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Default rendering with div class

```````````````````````````````` example(No Spacer - Ordered: 2) options(div-class, numbered)
[TOC]:#  

# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
.
[TOC]: #
# Table of Contents
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)
   1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)

# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Default rendering with div class, list class

```````````````````````````````` example(No Spacer - Ordered: 3) options(div-class, list-class, numbered)
[TOC]:#  

# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
.
[TOC]: #
# Table of Contents
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)
   1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)

# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Default rendering with list class

```````````````````````````````` example(No Spacer - Ordered: 4) options(list-class, numbered)
[TOC]:#  

# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
.
[TOC]: #
# Table of Contents
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)
   1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)

# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


start with missing first level

```````````````````````````````` example(No Spacer - Ordered: 5) options(numbered)
[TOC levels=1-6]:#  


## Header 1
# Header 2
### Header 3
## Header 4
# Header 5
.
[TOC levels=1-6]: #
# Table of Contents
1. [Header 1](#header-1)
1. [Header 2](#header-2)
   1. [Header 3](#header-3)
   1. [Header 4](#header-4)
1. [Header 5](#header-5)


## Header 1

# Header 2

### Header 3

## Header 4

# Header 5

````````````````````````````````


start with missing first 2 levels

```````````````````````````````` example(No Spacer - Ordered: 6) options(numbered)
[TOC levels=1-6]:#  


### Header 1
## Header 2
### Header 3
# Header 4
.
[TOC levels=1-6]: #
# Table of Contents
1. [Header 1](#header-1)
1. [Header 2](#header-2)
   1. [Header 3](#header-3)
1. [Header 4](#header-4)


### Header 1

## Header 2

### Header 3

# Header 4

````````````````````````````````


Text only style

```````````````````````````````` example(No Spacer - Ordered: 7) options(numbered)
[TOC text]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC text]: #
# Table of Contents
1. [Heading 1.1 some italic](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)
   1. [Heading 1.1.2  some bold italic](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text and inlines style

```````````````````````````````` example(No Spacer - Ordered: 8) options(text-only, numbered)
[TOC format]:#  


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC formatted]: #
# Table of Contents
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)
   1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text only, flat

```````````````````````````````` example(No Spacer - Ordered: 9) options(text-only, flat, numbered)
[TOC]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC]: #
# Table of Contents
1. [Heading 1.1 some italic](#heading-11-some-italic)
1. [Heading 1.1.1](#heading-111)
1. [Heading 1.1.2  some bold italic](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text and inlines, flat

```````````````````````````````` example(No Spacer - Ordered: 10) options(flat, numbered)
[TOC]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC]: #
# Table of Contents
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
1. [Heading 1.1.1](#heading-111)
1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text and inlines, hierarchy

```````````````````````````````` example(No Spacer - Ordered: 11) options(flat, numbered)
[TOC hierarchy]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC hierarchy]: #
# Table of Contents
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)
   1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text and inlines, flat

```````````````````````````````` example(No Spacer - Ordered: 12) options(flat-reversed, numbered)
[TOC]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1

.
[TOC]: #
# Table of Contents
1. [Heading 1.1.1](#heading-111)
1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)
1. [Heading 1.1 _some italic_](#heading-11-some-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

````````````````````````````````


Text and inlines, flat-reversed

```````````````````````````````` example(No Spacer - Ordered: 13) options(flat-reversed, numbered)
[TOC]:#


# Heading **some bold** 1
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
## Heading 1.1 _some italic_

.
[TOC]: #
# Table of Contents
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)
1. [Heading 1.1.1](#heading-111)


# Heading **some bold** 1

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

## Heading 1.1 _some italic_

````````````````````````````````


Text only, sorted

```````````````````````````````` example(No Spacer - Ordered: 14) options(text-only, sorted, numbered)
[TOC]:#


## Heading 1.1 _some italic_
# Heading **some bold** 1
### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1

.
[TOC]: #
# Table of Contents
1. [Heading 1.1 some italic](#heading-11-some-italic)
1. [Heading 1.1.1](#heading-111)
1. [Heading 1.1.2  some bold italic](#heading-112--some-bold-italic)


## Heading 1.1 _some italic_

# Heading **some bold** 1

### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

````````````````````````````````


Text and inlines, sorted

```````````````````````````````` example(No Spacer - Ordered: 15) options(sorted, numbered)
[TOC]:#


### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1
## Heading 1.1 _some italic_
# Heading **some bold** 1

.
[TOC]: #
# Table of Contents
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
1. [Heading 1.1.1](#heading-111)
1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

## Heading 1.1 _some italic_

# Heading **some bold** 1

````````````````````````````````


Text only, sorted

```````````````````````````````` example(No Spacer - Ordered: 16) options(text-only, sorted-reversed, numbered)
[TOC]:#


## Heading 1.1 _some italic_
# Heading **some bold** 1
### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1

.
[TOC]: #
# Table of Contents
1. [Heading 1.1.2  some bold italic](#heading-112--some-bold-italic)
1. [Heading 1.1.1](#heading-111)
1. [Heading 1.1 some italic](#heading-11-some-italic)


## Heading 1.1 _some italic_

# Heading **some bold** 1

### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

````````````````````````````````


Text and inlines, sorted reversed

```````````````````````````````` example(No Spacer - Ordered: 17) options(sorted-reversed, numbered)
[TOC]:#


### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1
## Heading 1.1 _some italic_
# Heading **some bold** 1

.
[TOC]: #
# Table of Contents
1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)
1. [Heading 1.1.1](#heading-111)
1. [Heading 1.1 _some italic_](#heading-11-some-italic)


### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

## Heading 1.1 _some italic_

# Heading **some bold** 1

````````````````````````````````


Text and inlines, unsorted

```````````````````````````````` example(No Spacer - Ordered: 18) options(sorted, numbered)
[TOC hierarchy]:#


### Heading 1.1.2  **_some bold italic_**
## Heading 1.1 _some italic_
### Heading 1.1.1
# Heading **some bold** 1

.
[TOC hierarchy]: #
# Table of Contents
1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)


### Heading 1.1.2  **_some bold italic_**

## Heading 1.1 _some italic_

### Heading 1.1.1

# Heading **some bold** 1

````````````````````````````````


Typographic chars included

```````````````````````````````` example(No Spacer - Ordered: 19) options(sorted, numbered)
[TOC hierarchy]:#


### Heading's 1.1.2  **_some bold italic_**
## Heading 1.1 _some italic_
### Heading 1.1.1
# Heading **some bold** 1

.
[TOC hierarchy]: #
# Table of Contents
1. [Heading's 1.1.2  **_some bold italic_**](#headings-112--some-bold-italic)
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)


### Heading's 1.1.2  **_some bold italic_**

## Heading 1.1 _some italic_

### Heading 1.1.1

# Heading **some bold** 1

````````````````````````````````


With Typographic extension included

```````````````````````````````` example(No Spacer - Ordered: 20) options(typographic, numbered)
[TOC hierarchy]:#


### Heading's 1.1.2  **_some bold italic_**
## Heading 1.1 _some italic_
### Heading 1.1.1
# Heading **some bold** 1

.
[TOC]: #
# Table of Contents
1. [Heading's 1.1.2  **_some bold italic_**](#headings-112--some-bold-italic)
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)


### Heading's 1.1.2  **_some bold italic_**

## Heading 1.1 _some italic_

### Heading 1.1.1

# Heading **some bold** 1

````````````````````````````````


```````````````````````````````` example(No Spacer - Ordered: 21) options(github, numbered)
[TOC hierarchy]:#


### Heading_add
## Heading2_add_more

.
[TOC]: #
# Table of Contents
1. [Heading_add](#heading_add)
1. [Heading2_add_more](#heading2_add_more)


### Heading_add

## Heading2_add_more

````````````````````````````````


## Spacer

### Unordered

Default rendering with emphasis

```````````````````````````````` example(Spacer - Unordered: 1) options(spacer)
[TOC]:#  

    
# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
.
[TOC]: #

# Table of Contents
- [Heading 1.1 _some italic_](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)
  - [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Default rendering with div class

```````````````````````````````` example(Spacer - Unordered: 2) options(div-class, spacer)
[TOC]:#  

    
# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
.
[TOC]: #

# Table of Contents
- [Heading 1.1 _some italic_](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)
  - [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Default rendering with div class, list class

```````````````````````````````` example(Spacer - Unordered: 3) options(div-class, list-class, spacer)
[TOC]:#  

    
# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
.
[TOC]: #

# Table of Contents
- [Heading 1.1 _some italic_](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)
  - [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Default rendering with list class

```````````````````````````````` example(Spacer - Unordered: 4) options(list-class, spacer)
[TOC]:#  

    
# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
.
[TOC]: #

# Table of Contents
- [Heading 1.1 _some italic_](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)
  - [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


start with missing first level

```````````````````````````````` example(Spacer - Unordered: 5) options(spacer)
[TOC levels=1-6]:#  


## Header 1
# Header 2
### Header 3
## Header 4
# Header 5
.
[TOC levels=1-6]: #

# Table of Contents
- [Header 1](#header-1)
- [Header 2](#header-2)
  - [Header 3](#header-3)
  - [Header 4](#header-4)
- [Header 5](#header-5)


## Header 1

# Header 2

### Header 3

## Header 4

# Header 5

````````````````````````````````


start with missing first 2 levels

```````````````````````````````` example(Spacer - Unordered: 6) options(spacer)
[TOC levels=1-6]:#  


### Header 1
## Header 2
### Header 3
# Header 4
.
[TOC levels=1-6]: #

# Table of Contents
- [Header 1](#header-1)
- [Header 2](#header-2)
  - [Header 3](#header-3)
- [Header 4](#header-4)


### Header 1

## Header 2

### Header 3

# Header 4

````````````````````````````````


Text only style

```````````````````````````````` example(Spacer - Unordered: 7) options(spacer)
[TOC text]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC text]: #

# Table of Contents
- [Heading 1.1 some italic](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)
  - [Heading 1.1.2  some bold italic](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text and inlines style

```````````````````````````````` example(Spacer - Unordered: 8) options(text-only, spacer)
[TOC format]:#  


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC formatted]: #

# Table of Contents
- [Heading 1.1 _some italic_](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)
  - [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text only, flat

```````````````````````````````` example(Spacer - Unordered: 9) options(text-only, flat, spacer)
[TOC]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC]: #

# Table of Contents
- [Heading 1.1 some italic](#heading-11-some-italic)
- [Heading 1.1.1](#heading-111)
- [Heading 1.1.2  some bold italic](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text and inlines, flat

```````````````````````````````` example(Spacer - Unordered: 10) options(flat, spacer)
[TOC]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC]: #

# Table of Contents
- [Heading 1.1 _some italic_](#heading-11-some-italic)
- [Heading 1.1.1](#heading-111)
- [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text and inlines, hierarchy

```````````````````````````````` example(Spacer - Unordered: 11) options(flat, spacer)
[TOC hierarchy]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC hierarchy]: #

# Table of Contents
- [Heading 1.1 _some italic_](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)
  - [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text and inlines, flat

```````````````````````````````` example(Spacer - Unordered: 12) options(flat-reversed, spacer)
[TOC]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1

.
[TOC]: #

# Table of Contents
- [Heading 1.1.1](#heading-111)
- [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)
- [Heading 1.1 _some italic_](#heading-11-some-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

````````````````````````````````


Text and inlines, flat-reversed

```````````````````````````````` example(Spacer - Unordered: 13) options(flat-reversed, spacer)
[TOC]:#


# Heading **some bold** 1
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
## Heading 1.1 _some italic_

.
[TOC]: #

# Table of Contents
- [Heading 1.1 _some italic_](#heading-11-some-italic)
- [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)
- [Heading 1.1.1](#heading-111)


# Heading **some bold** 1

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

## Heading 1.1 _some italic_

````````````````````````````````


Text only, sorted

```````````````````````````````` example(Spacer - Unordered: 14) options(text-only, sorted, spacer)
[TOC]:#


## Heading 1.1 _some italic_
# Heading **some bold** 1
### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1

.
[TOC]: #

# Table of Contents
- [Heading 1.1 some italic](#heading-11-some-italic)
- [Heading 1.1.1](#heading-111)
- [Heading 1.1.2  some bold italic](#heading-112--some-bold-italic)


## Heading 1.1 _some italic_

# Heading **some bold** 1

### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

````````````````````````````````


Text and inlines, sorted

```````````````````````````````` example(Spacer - Unordered: 15) options(sorted, spacer)
[TOC]:#


### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1
## Heading 1.1 _some italic_
# Heading **some bold** 1

.
[TOC]: #

# Table of Contents
- [Heading 1.1 _some italic_](#heading-11-some-italic)
- [Heading 1.1.1](#heading-111)
- [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

## Heading 1.1 _some italic_

# Heading **some bold** 1

````````````````````````````````


Text only, sorted

```````````````````````````````` example(Spacer - Unordered: 16) options(text-only, sorted-reversed, spacer)
[TOC]:#


## Heading 1.1 _some italic_
# Heading **some bold** 1
### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1

.
[TOC]: #

# Table of Contents
- [Heading 1.1.2  some bold italic](#heading-112--some-bold-italic)
- [Heading 1.1.1](#heading-111)
- [Heading 1.1 some italic](#heading-11-some-italic)


## Heading 1.1 _some italic_

# Heading **some bold** 1

### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

````````````````````````````````


Text and inlines, sorted reversed

```````````````````````````````` example(Spacer - Unordered: 17) options(sorted-reversed, spacer)
[TOC]:#


### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1
## Heading 1.1 _some italic_
# Heading **some bold** 1

.
[TOC]: #

# Table of Contents
- [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)
- [Heading 1.1.1](#heading-111)
- [Heading 1.1 _some italic_](#heading-11-some-italic)


### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

## Heading 1.1 _some italic_

# Heading **some bold** 1

````````````````````````````````


Text and inlines, unsorted

```````````````````````````````` example(Spacer - Unordered: 18) options(sorted, spacer)
[TOC hierarchy]:#


### Heading 1.1.2  **_some bold italic_**
## Heading 1.1 _some italic_
### Heading 1.1.1
# Heading **some bold** 1

.
[TOC hierarchy]: #

# Table of Contents
- [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)
- [Heading 1.1 _some italic_](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)


### Heading 1.1.2  **_some bold italic_**

## Heading 1.1 _some italic_

### Heading 1.1.1

# Heading **some bold** 1

````````````````````````````````


Typographic chars included

```````````````````````````````` example(Spacer - Unordered: 19) options(sorted, spacer)
[TOC hierarchy]:#


### Heading's 1.1.2  **_some bold italic_**
## Heading 1.1 _some italic_
### Heading 1.1.1
# Heading **some bold** 1

.
[TOC hierarchy]: #

# Table of Contents
- [Heading's 1.1.2  **_some bold italic_**](#headings-112--some-bold-italic)
- [Heading 1.1 _some italic_](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)


### Heading's 1.1.2  **_some bold italic_**

## Heading 1.1 _some italic_

### Heading 1.1.1

# Heading **some bold** 1

````````````````````````````````


With Typographic extension included

```````````````````````````````` example(Spacer - Unordered: 20) options(typographic, spacer)
[TOC hierarchy]:#


### Heading's 1.1.2  **_some bold italic_**
## Heading 1.1 _some italic_
### Heading 1.1.1
# Heading **some bold** 1

.
[TOC]: #

# Table of Contents
- [Heading's 1.1.2  **_some bold italic_**](#headings-112--some-bold-italic)
- [Heading 1.1 _some italic_](#heading-11-some-italic)
  - [Heading 1.1.1](#heading-111)


### Heading's 1.1.2  **_some bold italic_**

## Heading 1.1 _some italic_

### Heading 1.1.1

# Heading **some bold** 1

````````````````````````````````


```````````````````````````````` example(Spacer - Unordered: 21) options(github, spacer)
[TOC hierarchy]:#


### Heading_add
## Heading2_add_more

.
[TOC]: #

# Table of Contents
- [Heading_add](#heading_add)
- [Heading2_add_more](#heading2_add_more)


### Heading_add

## Heading2_add_more

````````````````````````````````


### Ordered

Default rendering with emphasis

```````````````````````````````` example(Spacer - Ordered: 1) options(numbered, spacer)
[TOC]:#  

    
# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
.
[TOC]: #

# Table of Contents
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)
   1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Default rendering with div class

```````````````````````````````` example(Spacer - Ordered: 2) options(div-class, numbered, spacer)
[TOC]:#  

    
# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
.
[TOC]: #

# Table of Contents
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)
   1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Default rendering with div class, list class

```````````````````````````````` example(Spacer - Ordered: 3) options(div-class, list-class, numbered, spacer)
[TOC]:#  

    
# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
.
[TOC]: #

# Table of Contents
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)
   1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Default rendering with list class

```````````````````````````````` example(Spacer - Ordered: 4) options(list-class, numbered, spacer)
[TOC]:#  

    
# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
.
[TOC]: #

# Table of Contents
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)
   1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


start with missing first level

```````````````````````````````` example(Spacer - Ordered: 5) options(numbered, spacer)
[TOC levels=1-6]:#  


## Header 1
# Header 2
### Header 3
## Header 4
# Header 5
.
[TOC levels=1-6]: #

# Table of Contents
1. [Header 1](#header-1)
1. [Header 2](#header-2)
   1. [Header 3](#header-3)
   1. [Header 4](#header-4)
1. [Header 5](#header-5)


## Header 1

# Header 2

### Header 3

## Header 4

# Header 5

````````````````````````````````


start with missing first 2 levels

```````````````````````````````` example(Spacer - Ordered: 6) options(numbered, spacer)
[TOC levels=1-6]:#  


### Header 1
## Header 2
### Header 3
# Header 4
.
[TOC levels=1-6]: #

# Table of Contents
1. [Header 1](#header-1)
1. [Header 2](#header-2)
   1. [Header 3](#header-3)
1. [Header 4](#header-4)


### Header 1

## Header 2

### Header 3

# Header 4

````````````````````````````````


Text only style

```````````````````````````````` example(Spacer - Ordered: 7) options(numbered, spacer)
[TOC text]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC text]: #

# Table of Contents
1. [Heading 1.1 some italic](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)
   1. [Heading 1.1.2  some bold italic](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text and inlines style

```````````````````````````````` example(Spacer - Ordered: 8) options(text-only, numbered, spacer)
[TOC format]:#  


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC formatted]: #

# Table of Contents
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)
   1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text only, flat

```````````````````````````````` example(Spacer - Ordered: 9) options(text-only, flat, numbered, spacer)
[TOC]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC]: #

# Table of Contents
1. [Heading 1.1 some italic](#heading-11-some-italic)
1. [Heading 1.1.1](#heading-111)
1. [Heading 1.1.2  some bold italic](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text and inlines, flat

```````````````````````````````` example(Spacer - Ordered: 10) options(flat, numbered, spacer)
[TOC]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC]: #

# Table of Contents
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
1. [Heading 1.1.1](#heading-111)
1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text and inlines, hierarchy

```````````````````````````````` example(Spacer - Ordered: 11) options(flat, numbered, spacer)
[TOC hierarchy]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**

.
[TOC hierarchy]: #

# Table of Contents
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)
   1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

````````````````````````````````


Text and inlines, flat

```````````````````````````````` example(Spacer - Ordered: 12) options(flat-reversed, numbered, spacer)
[TOC]:#


# Heading **some bold** 1
## Heading 1.1 _some italic_
### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1

.
[TOC]: #

# Table of Contents
1. [Heading 1.1.1](#heading-111)
1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)
1. [Heading 1.1 _some italic_](#heading-11-some-italic)


# Heading **some bold** 1

## Heading 1.1 _some italic_

### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

````````````````````````````````


Text and inlines, flat-reversed

```````````````````````````````` example(Spacer - Ordered: 13) options(flat-reversed, numbered, spacer)
[TOC]:#


# Heading **some bold** 1
### Heading 1.1.1
### Heading 1.1.2  **_some bold italic_**
## Heading 1.1 _some italic_

.
[TOC]: #

# Table of Contents
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)
1. [Heading 1.1.1](#heading-111)


# Heading **some bold** 1

### Heading 1.1.1

### Heading 1.1.2  **_some bold italic_**

## Heading 1.1 _some italic_

````````````````````````````````


Text only, sorted

```````````````````````````````` example(Spacer - Ordered: 14) options(text-only, sorted, numbered, spacer)
[TOC]:#


## Heading 1.1 _some italic_
# Heading **some bold** 1
### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1

.
[TOC]: #

# Table of Contents
1. [Heading 1.1 some italic](#heading-11-some-italic)
1. [Heading 1.1.1](#heading-111)
1. [Heading 1.1.2  some bold italic](#heading-112--some-bold-italic)


## Heading 1.1 _some italic_

# Heading **some bold** 1

### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

````````````````````````````````


Text and inlines, sorted

```````````````````````````````` example(Spacer - Ordered: 15) options(sorted, numbered, spacer)
[TOC]:#


### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1
## Heading 1.1 _some italic_
# Heading **some bold** 1

.
[TOC]: #

# Table of Contents
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
1. [Heading 1.1.1](#heading-111)
1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)


### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

## Heading 1.1 _some italic_

# Heading **some bold** 1

````````````````````````````````


Text only, sorted

```````````````````````````````` example(Spacer - Ordered: 16) options(text-only, sorted-reversed, numbered, spacer)
[TOC]:#


## Heading 1.1 _some italic_
# Heading **some bold** 1
### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1

.
[TOC]: #

# Table of Contents
1. [Heading 1.1.2  some bold italic](#heading-112--some-bold-italic)
1. [Heading 1.1.1](#heading-111)
1. [Heading 1.1 some italic](#heading-11-some-italic)


## Heading 1.1 _some italic_

# Heading **some bold** 1

### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

````````````````````````````````


Text and inlines, sorted reversed

```````````````````````````````` example(Spacer - Ordered: 17) options(sorted-reversed, numbered, spacer)
[TOC]:#


### Heading 1.1.2  **_some bold italic_**
### Heading 1.1.1
## Heading 1.1 _some italic_
# Heading **some bold** 1

.
[TOC]: #

# Table of Contents
1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)
1. [Heading 1.1.1](#heading-111)
1. [Heading 1.1 _some italic_](#heading-11-some-italic)


### Heading 1.1.2  **_some bold italic_**

### Heading 1.1.1

## Heading 1.1 _some italic_

# Heading **some bold** 1

````````````````````````````````


Text and inlines, unsorted

```````````````````````````````` example(Spacer - Ordered: 18) options(sorted, numbered, spacer)
[TOC hierarchy]:#


### Heading 1.1.2  **_some bold italic_**
## Heading 1.1 _some italic_
### Heading 1.1.1
# Heading **some bold** 1

.
[TOC hierarchy]: #

# Table of Contents
1. [Heading 1.1.2  **_some bold italic_**](#heading-112--some-bold-italic)
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)


### Heading 1.1.2  **_some bold italic_**

## Heading 1.1 _some italic_

### Heading 1.1.1

# Heading **some bold** 1

````````````````````````````````


Typographic chars included

```````````````````````````````` example(Spacer - Ordered: 19) options(sorted, numbered, spacer)
[TOC hierarchy]:#


### Heading's 1.1.2  **_some bold italic_**
## Heading 1.1 _some italic_
### Heading 1.1.1
# Heading **some bold** 1

.
[TOC hierarchy]: #

# Table of Contents
1. [Heading's 1.1.2  **_some bold italic_**](#headings-112--some-bold-italic)
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)


### Heading's 1.1.2  **_some bold italic_**

## Heading 1.1 _some italic_

### Heading 1.1.1

# Heading **some bold** 1

````````````````````````````````


With Typographic extension included

```````````````````````````````` example(Spacer - Ordered: 20) options(typographic, numbered, spacer)
[TOC hierarchy]:#


### Heading's 1.1.2  **_some bold italic_**
## Heading 1.1 _some italic_
### Heading 1.1.1
# Heading **some bold** 1

.
[TOC]: #

# Table of Contents
1. [Heading's 1.1.2  **_some bold italic_**](#headings-112--some-bold-italic)
1. [Heading 1.1 _some italic_](#heading-11-some-italic)
   1. [Heading 1.1.1](#heading-111)


### Heading's 1.1.2  **_some bold italic_**

## Heading 1.1 _some italic_

### Heading 1.1.1

# Heading **some bold** 1

````````````````````````````````


```````````````````````````````` example(Spacer - Ordered: 21) options(github, numbered, spacer)
[TOC hierarchy]:#


### Heading_add
## Heading2_add_more

.
[TOC]: #

# Table of Contents
1. [Heading_add](#heading_add)
1. [Heading2_add_more](#heading2_add_more)


### Heading_add

## Heading2_add_more

````````````````````````````````


## As Is

```````````````````````````````` example(As Is: 1) options(github, numbered, spacer, on-format-as-is)
[TOC hierarchy]:#

* [Heading_add](#heading_add)
* [Heading2_add_more](#heading2_add_more)


### Heading_add
## Heading2_add_more

.
[TOC hierarchy]:#

* [Heading_add](#heading_add)
* [Heading2_add_more](#heading2_add_more)


### Heading_add

## Heading2_add_more

````````````````````````````````


## Update

```````````````````````````````` example(Update: 1) options(github, numbered, spacer, on-format-update)
[TOC hierarchy]:#

* [Heading_add](#heading_add)
* [Heading2_add_more](#heading2_add_more)

    
### Heading_add
## Heading2_add_more

.
[TOC]: #

# Table of Contents
1. [Heading_add](#heading_add)
1. [Heading2_add_more](#heading2_add_more)


### Heading_add

## Heading2_add_more

````````````````````````````````


## Remove

```````````````````````````````` example(Remove: 1) options(github, numbered, spacer, on-format-remove)
[TOC hierarchy]:#

* [Heading_add](#heading_add)
* [Heading2_add_more](#heading2_add_more)


### Heading_add
## Heading2_add_more

.
[TOC]: #


### Heading_add

## Heading2_add_more

````````````````````````````````


## Issue

### xxx-01

```````````````````````````````` example(Issue - xxx-01: 1) options(spacer)
## Header 2
### Header 3

[TOC levels=1-3]:# "title\"s"

### title"s
- [Header 2](#header-2)
    - [Header 3](#header-3)
.
## Header 2

### Header 3

[TOC levels=1-3]: # "title\"s"

# title"s
- [Header 2](#header-2)
  - [Header 3](#header-3)
````````````````````````````````


