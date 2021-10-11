package legend.game.types;

import legend.core.memory.Value;
import legend.core.memory.types.BoolRef;
import legend.core.memory.types.MemoryRef;
import legend.core.memory.types.UnsignedByteRef;
import legend.core.memory.types.UnsignedIntRef;

public class SomethingStruct2 implements MemoryRef {
  private final Value ref;

  public final UnsignedByteRef count_00;
  public final BoolRef bool_01;
  public final UnsignedIntRef ptr_04;

  public SomethingStruct2(final Value ref) {
    this.ref = ref;

    this.count_00 = ref.offset(1, 0x00L).cast(UnsignedByteRef::new);
    this.bool_01 = ref.offset(1, 0x01L).cast(BoolRef::new);
    this.ptr_04 = ref.offset(4, 0x04L).cast(UnsignedIntRef::new);
  }

  @Override
  public long getAddress() {
    return this.ref.getAddress();
  }
}
