#include <stdarg.h>
#include <stdbool.h>
#include <stdint.h>
#include <stdlib.h>

typedef enum SimpleEnum {
  One,
  Two,
  Three,
} SimpleEnum;

typedef struct SimpleStruct {
  uint32_t x;
  uint64_t y;
} SimpleStruct;

typedef struct NestedStruct {
  float a;
  struct SimpleStruct bar;
  float b;
} NestedStruct;

typedef enum ComplexEnum_Tag {
  ItemWithNumber,
  ItemWithStruct,
  ItemWithNothing,
} ComplexEnum_Tag;

typedef struct ItemWithNumber_Body {
  uint64_t x;
} ItemWithNumber_Body;

typedef struct ItemWithStruct_Body {
  struct SimpleStruct s;
} ItemWithStruct_Body;

typedef struct ComplexEnum {
  ComplexEnum_Tag tag;
  union {
    ItemWithNumber_Body item_with_number;
    ItemWithStruct_Body item_with_struct;
  };
} ComplexEnum;

uint64_t primitive_arguments(uint64_t left, uint64_t right);

void gets_simple_struct(const struct SimpleStruct *b);

void gets_simple_struct_by_value(struct SimpleStruct b);

void gets_nested_struct(const struct NestedStruct *x);

void gets_simple_enum(enum SimpleEnum x);

void gets_complex_enum(const struct ComplexEnum *x);

void gets_string(const char *s);

void gets_array(const struct SimpleStruct *arr, uintptr_t len);

void gets_callback(void (*f)(uint32_t));
