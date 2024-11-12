
// todo thing to test
// Plane arguments and return value [x]
// Structs [x]
// Nested Structs [x]
// Structs by reference [x]
// Enums [x]
// Strings [x]
// arrays [x]
// function pointers

use core::slice;
use std::ffi::{CStr, CString, OsString};

#[no_mangle]
pub extern "C" fn primitive_arguments(left: u64, right: u64) -> u64 {
    left + right
}

#[repr(C)]
#[derive(Debug)]
pub struct SimpleStruct {
    x: u32,
    y: u64,
}

#[no_mangle]
pub extern "C" fn gets_simple_struct(b: &SimpleStruct) {
    println!("{:?}", b);
}

#[no_mangle]
pub extern "C" fn gets_simple_struct_by_value(b: SimpleStruct) {
    println!("{:?}", b);
}

#[repr(C)]
#[derive(Debug)]
pub struct NestedStruct {
    a: f32,
    bar: SimpleStruct,
    b: f32
}

#[no_mangle]
pub extern "C" fn gets_nested_struct(x: &NestedStruct) {
    println!("{:?}", x);
}

#[repr(C)]
#[derive(Debug)]
pub enum SimpleEnum {
    One,
    Two,
    Three
}

#[no_mangle]
pub extern "C" fn gets_simple_enum(x: SimpleEnum) {
    println!("{:?}", x);
}

#[repr(C)]
#[derive(Debug)]
pub enum ComplexEnum {
    ItemWithNumber { x: u64 },
    ItemWithStruct { s: SimpleStruct },
    ItemWithNothing
}

#[no_mangle]
pub extern "C" fn gets_complex_enum(x: &ComplexEnum) {
    println!("{:?}", x);
}

#[no_mangle]
pub extern "C" fn gets_string(s: *const std::ffi::c_char) {
    let text = unsafe { CStr::from_ptr(s) }.to_str();
    println!("{:?}", text);
}

#[no_mangle]
pub extern "C" fn gets_array(arr: *const SimpleStruct, len: usize) {
    let input_array = unsafe {
        assert!(!arr.is_null());
        slice::from_raw_parts(arr, len)
    };
    println!("{:?}", input_array);
}

#[no_mangle]
pub extern "C" fn gets_callback(f: extern "C" fn(u32)) {
    f(42);
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn it_works() {
        let result = primitive_arguments(2, 2);
        assert_eq!(result, 4);
    }
}
