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
 * struct NestedStruct {
 *     float a;
 *     struct SimpleStruct bar;
 *     float b;
 * }
 * }
 */
public class NestedStruct {

    NestedStruct() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        panama_header_h.C_FLOAT.withName("a"),
        MemoryLayout.paddingLayout(4),
        SimpleStruct.layout().withName("bar"),
        panama_header_h.C_FLOAT.withName("b"),
        MemoryLayout.paddingLayout(4)
    ).withName("NestedStruct");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfFloat a$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("a"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float a
     * }
     */
    public static final OfFloat a$layout() {
        return a$LAYOUT;
    }

    private static final long a$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float a
     * }
     */
    public static final long a$offset() {
        return a$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float a
     * }
     */
    public static float a(MemorySegment struct) {
        return struct.get(a$LAYOUT, a$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float a
     * }
     */
    public static void a(MemorySegment struct, float fieldValue) {
        struct.set(a$LAYOUT, a$OFFSET, fieldValue);
    }

    private static final GroupLayout bar$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("bar"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct SimpleStruct bar
     * }
     */
    public static final GroupLayout bar$layout() {
        return bar$LAYOUT;
    }

    private static final long bar$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct SimpleStruct bar
     * }
     */
    public static final long bar$offset() {
        return bar$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct SimpleStruct bar
     * }
     */
    public static MemorySegment bar(MemorySegment struct) {
        return struct.asSlice(bar$OFFSET, bar$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct SimpleStruct bar
     * }
     */
    public static void bar(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, bar$OFFSET, bar$LAYOUT.byteSize());
    }

    private static final OfFloat b$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("b"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float b
     * }
     */
    public static final OfFloat b$layout() {
        return b$LAYOUT;
    }

    private static final long b$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float b
     * }
     */
    public static final long b$offset() {
        return b$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float b
     * }
     */
    public static float b(MemorySegment struct) {
        return struct.get(b$LAYOUT, b$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float b
     * }
     */
    public static void b(MemorySegment struct, float fieldValue) {
        struct.set(b$LAYOUT, b$OFFSET, fieldValue);
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
