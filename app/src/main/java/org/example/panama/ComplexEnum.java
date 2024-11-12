// Generated by jextract

package org.example.panama;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct ComplexEnum {
 *     ComplexEnum_Tag tag;
 *     union {
 *         ItemWithNumber_Body item_with_number;
 *         ItemWithStruct_Body item_with_struct;
 *     };
 * }
 * }
 */
public class ComplexEnum {

    ComplexEnum() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        panama_header_h.C_INT.withName("tag"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.unionLayout(
            ItemWithNumber_Body.layout().withName("item_with_number"),
            ItemWithStruct_Body.layout().withName("item_with_struct")
        ).withName("$anon$39:3")
    ).withName("ComplexEnum");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt tag$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ComplexEnum_Tag tag
     * }
     */
    public static final OfInt tag$layout() {
        return tag$LAYOUT;
    }

    private static final long tag$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ComplexEnum_Tag tag
     * }
     */
    public static final long tag$offset() {
        return tag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ComplexEnum_Tag tag
     * }
     */
    public static int tag(MemorySegment struct) {
        return struct.get(tag$LAYOUT, tag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ComplexEnum_Tag tag
     * }
     */
    public static void tag(MemorySegment struct, int fieldValue) {
        struct.set(tag$LAYOUT, tag$OFFSET, fieldValue);
    }

    private static final GroupLayout item_with_number$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$39:3"), groupElement("item_with_number"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ItemWithNumber_Body item_with_number
     * }
     */
    public static final GroupLayout item_with_number$layout() {
        return item_with_number$LAYOUT;
    }

    private static final long item_with_number$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ItemWithNumber_Body item_with_number
     * }
     */
    public static final long item_with_number$offset() {
        return item_with_number$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ItemWithNumber_Body item_with_number
     * }
     */
    public static MemorySegment item_with_number(MemorySegment struct) {
        return struct.asSlice(item_with_number$OFFSET, item_with_number$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ItemWithNumber_Body item_with_number
     * }
     */
    public static void item_with_number(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, item_with_number$OFFSET, item_with_number$LAYOUT.byteSize());
    }

    private static final GroupLayout item_with_struct$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$39:3"), groupElement("item_with_struct"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ItemWithStruct_Body item_with_struct
     * }
     */
    public static final GroupLayout item_with_struct$layout() {
        return item_with_struct$LAYOUT;
    }

    private static final long item_with_struct$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ItemWithStruct_Body item_with_struct
     * }
     */
    public static final long item_with_struct$offset() {
        return item_with_struct$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ItemWithStruct_Body item_with_struct
     * }
     */
    public static MemorySegment item_with_struct(MemorySegment struct) {
        return struct.asSlice(item_with_struct$OFFSET, item_with_struct$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ItemWithStruct_Body item_with_struct
     * }
     */
    public static void item_with_struct(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, item_with_struct$OFFSET, item_with_struct$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}
