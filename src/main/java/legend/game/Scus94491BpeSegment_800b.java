package legend.game;

import legend.core.cdrom.CdlDIR;
import legend.core.cdrom.CdlFILE;
import legend.core.cdrom.CdlPacket;
import legend.core.cdrom.FileLoadingInfo;
import legend.core.cdrom.Response;
import legend.core.cdrom.SyncCode;
import legend.core.gpu.TimHeader;
import legend.core.memory.Value;
import legend.core.memory.types.ArrayRef;
import legend.core.memory.types.BiConsumerRef;
import legend.core.memory.types.BoolRef;
import legend.core.memory.types.ByteRef;
import legend.core.memory.types.CString;
import legend.core.memory.types.EnumRef;
import legend.core.memory.types.Pointer;
import legend.core.memory.types.RunnableRef;
import legend.core.memory.types.UnsignedIntRef;

import static legend.core.Hardware.MEMORY;
import static legend.core.LibDs.DSL_MAX_COMMAND;

public final class Scus94491BpeSegment_800b {
  private Scus94491BpeSegment_800b() { }

  public static final Value _800babc0 = MEMORY.ref(1, 0x800babc0L);

  public static final Value _800bac68 = MEMORY.ref(1, 0x800bac68L);

  public static final Value mono_800bb0a8 = MEMORY.ref(1, 0x800bb0a8L);
  public static final Value vibrationEnabled_800bb0a9 = MEMORY.ref(1, 0x800bb0a9L);

  public static final Value _800bb0f8 = MEMORY.ref(4, 0x800bb0f8L);
  public static final Value _800bb0fc = MEMORY.ref(4, 0x800bb0fcL);

  public static final Value _800bb104 = MEMORY.ref(4, 0x800bb104L);
  public static final Value doubleBufferFrame_800bb108 = MEMORY.ref(4, 0x800bb108L);
  public static final Value loadingStage_800bb10c = MEMORY.ref(4, 0x800bb10cL);
  public static final Value _800bb110 = MEMORY.ref(2, 0x800bb110L);
  public static final Value _800bb112 = MEMORY.ref(2, 0x800bb112L);
  public static final Value _800bb114 = MEMORY.ref(2, 0x800bb114L);
  public static final Value _800bb116 = MEMORY.ref(2, 0x800bb116L);
  public static final Value _800bb118 = MEMORY.ref(2, 0x800bb118L);

  public static final Value _800bb120 = MEMORY.ref(2, 0x800bb120L);

  public static final Value _800bb134 = MEMORY.ref(2, 0x800bb134L);

  public static final Value _800bb140 = MEMORY.ref(4, 0x800bb140L);
  public static final Value _800bb144 = MEMORY.ref(4, 0x800bb144L);
  public static final Value _800bb148 = MEMORY.ref(4, 0x800bb148L);
  public static final Value _800bb14c = MEMORY.ref(4, 0x800bb14cL);
  public static final Value _800bb150 = MEMORY.ref(4, 0x800bb150L);
  public static final Value _800bb154 = MEMORY.ref(4, 0x800bb154L);
  public static final Value _800bb158 = MEMORY.ref(4, 0x800bb158L);
  public static final Value _800bb15c = MEMORY.ref(4, 0x800bb15cL);
  public static final Value _800bb160 = MEMORY.ref(4, 0x800bb160L);
  public static final Value _800bb164 = MEMORY.ref(4, 0x800bb164L);
  public static final Value _800bb168 = MEMORY.ref(4, 0x800bb168L);

  public static final ArrayRef<UnsignedIntRef> array_800bb198 = MEMORY.ref(4, 0x800bb198L, ArrayRef.of(UnsignedIntRef.class, 36, 4, UnsignedIntRef::new));

  public static final Value _800bb228 = MEMORY.ref(4, 0x800bb228L);

  public static final Value _800bb348 = MEMORY.ref(4, 0x800bb348L);

  public static final Value transferDest_800bb460 = MEMORY.ref(4, 0x800bb460L);
  public static final Value fileSize_800bb464 = MEMORY.ref(4, 0x800bb464L);
  public static final FileLoadingInfo currentlyLoadingFileInfo_800bb468 = MEMORY.ref(4, 0x800bb468L, FileLoadingInfo::new);
  public static final Value fileTransferDest_800bb488 = MEMORY.ref(4, 0x800bb488L);
  public static final Value fileSize_800bb48c = MEMORY.ref(4, 0x800bb48cL);
  public static final Value numberOfTransfers_800bb490 = MEMORY.ref(4, 0x800bb490L);
  public static final Value transferIndex_800bb494 = MEMORY.ref(4, 0x800bb494L);

  public static final ArrayRef<CdlFILE> CdlFILE_800bb4c8 = MEMORY.ref(0x600, 0x800bb4c8L, ArrayRef.of(CdlFILE.class, 0x40, 0x18, CdlFILE::new));

  public static final Value _800bbac8 = MEMORY.ref(1, 0x800bbac8L);

  public static final Value linkedListEntry_800bbacc = MEMORY.ref(4, 0x800bbaccL);
  public static final BoolRef SInitBinLoaded_800bbad0 = MEMORY.ref(1, 0x800bbad0L, BoolRef::new);

  public static final ArrayRef<FileLoadingInfo> fileLoadingInfoArray_800bbad8 = MEMORY.ref(0x580, 0x800bbad8L, ArrayRef.of(FileLoadingInfo.class, 44, 32, FileLoadingInfo::new));
  public static final Value drgnBinIndex_800bc058 = MEMORY.ref(4, 0x800bc058L);

  public static final Value _800bc060 = MEMORY.ref(4, 0x800bc060L);

  public static final Value _800bc070 = MEMORY.ref(4, 0x800bc070L);
  public static final Value _800bc074 = MEMORY.ref(4, 0x800bc074L);
  public static final Value _800bc078 = MEMORY.ref(4, 0x800bc078L);
  public static final Value _800bc07c = MEMORY.ref(4, 0x800bc07cL);
  public static final Value _800bc080 = MEMORY.ref(4, 0x800bc080L);
  public static final Value _800bc084 = MEMORY.ref(4, 0x800bc084L);
  public static final Value _800bc088 = MEMORY.ref(4, 0x800bc088L);
  public static final Value _800bc08c = MEMORY.ref(4, 0x800bc08cL);

  public static final Value _800bc0b8 = MEMORY.ref(1, 0x800bc0b8L);
  public static final Value _800bc0b9 = MEMORY.ref(1, 0x800bc0b9L);

  public static final Value _800bc0c0 = MEMORY.ref(4, 0x800bc0c0L);

  public static final Value _800bc1c0 = MEMORY.ref(4, 0x800bc1c0L);

  public static final TimHeader timHeader_800bc2e0 = MEMORY.ref(0x1c, 0x800bc2e0L, TimHeader::new);

  public static final Value _800bc300 = MEMORY.ref(4, 0x800bc300L);
  public static final Value _800bc304 = MEMORY.ref(4, 0x800bc304L);
  public static final Value _800bc308 = MEMORY.ref(4, 0x800bc308L);

  public static final Value _800bc960 = MEMORY.ref(1, 0x800bc960L);

  //TODO structure @ 800bc980... 4 * 12?
  public static final Value _800bc981 = MEMORY.ref(1, 0x800bc981L);

  public static final Value linkedListEntry_800bc984 = MEMORY.ref(4, 0x800bc984L);
  public static final Value _800bc988 = MEMORY.ref(4, 0x800bc988L);
  //TODO

  public static final Value _800bc9a0 = MEMORY.ref(2, 0x800bc9a0L);

  public static final Value _800bc9aa = MEMORY.ref(1, 0x800bc9aaL);
  public static final Value _800bc9ab = MEMORY.ref(1, 0x800bc9abL);
  public static final Value _800bc9ac = MEMORY.ref(4, 0x800bc9acL);

  public static final Value _800bca68 = MEMORY.ref(1, 0x800bca68L);

  public static final Value _800bca6c = MEMORY.ref(4, 0x800bca6cL);

  public static final Value _800bcf64 = MEMORY.ref(2, 0x800bcf64L);

  public static final Value _800bcf78 = MEMORY.ref(4, 0x800bcf78L);

  public static final Value _800bcf80 = MEMORY.ref(2, 0x800bcf80L);

  public static final Value linkedListEntry_800bcf84 = MEMORY.ref(4, 0x800bcf84L);
  public static final Value _800bcf88 = MEMORY.ref(4, 0x800bcf88L);

  public static final Value _800bcf90 = MEMORY.ref(2, 0x800bcf90L);

  public static final Value _800bcff0 = MEMORY.ref(2, 0x800bcff0L);

  public static final Value _800bcff4 = MEMORY.ref(2, 0x800bcff4L);

  public static final Value _800bd000 = MEMORY.ref(2, 0x800bd000L);

  public static final Value _800bd060 = MEMORY.ref(2, 0x800bd060L);

  public static final Value _800bd064 = MEMORY.ref(4, 0x800bd064L);

  public static final Value _800bd070 = MEMORY.ref(2, 0x800bd070L);

  public static final Value _800bd07c = MEMORY.ref(2, 0x800bd07cL);

  public static final Value _800bd080 = MEMORY.ref(4, 0x800bd080L);

  public static final Value _800bd08c = MEMORY.ref(2, 0x800bd08cL);

  public static final Value _800bd098 = MEMORY.ref(2, 0x800bd098L);

  public static final Value _800bd09c = MEMORY.ref(4, 0x800bd09cL);

  public static final Value _800bd0a8 = MEMORY.ref(2, 0x800bd0a8L);

  public static final Value _800bd0b4 = MEMORY.ref(2, 0x800bd0b4L);
  public static final Value _800bd0b6 = MEMORY.ref(2, 0x800bd0b6L);
  public static final Value _800bd0b8 = MEMORY.ref(4, 0x800bd0b8L);

  public static final Value _800bd0c4 = MEMORY.ref(2, 0x800bd0c4L);

  public static final Value _800bd0c8 = MEMORY.ref(4, 0x800bd0c8L);
  public static final Value _800bd0cc = MEMORY.ref(1, 0x800bd0ccL);

  public static final Value _800bd0d0 = MEMORY.ref(2, 0x800bd0d0L);

  public static final Value _800bd0d4 = MEMORY.ref(4, 0x800bd0d4L);

  public static final Value _800bd0e0 = MEMORY.ref(2, 0x800bd0e0L);

  public static final Value _800bd0f0 = MEMORY.ref(2, 0x800bd0f0L);

  public static final Value _800bd0f8 = MEMORY.ref(2, 0x800bd0f8L);

  public static final Value _800bd0fc = MEMORY.ref(4, 0x800bd0fcL);
  public static final Value _800bd100 = MEMORY.ref(4, 0x800bd100L);
  public static final Value _800bd104 = MEMORY.ref(4, 0x800bd104L);
  public static final Value _800bd108 = MEMORY.ref(2, 0x800bd108L);

  public static final Value _800bd110 = MEMORY.ref(1, 0x800bd110L);

  public static final Value _800bd114 = MEMORY.ref(4, 0x800bd114L);
  public static final Value _800bd118 = MEMORY.ref(4, 0x800bd118L);
  public static final Value _800bd11c = MEMORY.ref(4, 0x800bd11cL);
  public static final Value _800bd120 = MEMORY.ref(2, 0x800bd120L);
  public static final Value _800bd122 = MEMORY.ref(2, 0x800bd122L);
  public static final Value _800bd124 = MEMORY.ref(2, 0x800bd124L);
  public static final Value _800bd126 = MEMORY.ref(2, 0x800bd126L);
  public static final Value _800bd128 = MEMORY.ref(2, 0x800bd128L);
  public static final Value _800bd12a = MEMORY.ref(2, 0x800bd12aL);
  public static final Value _800bd12c = MEMORY.ref(4, 0x800bd12cL);

  public static final Value _800bd600 = MEMORY.ref(2, 0x800bd600L);

  public static final Value _800bd610 = MEMORY.ref(2, 0x800bd610L);

  public static final Value _800bd614 = MEMORY.ref(4, 0x800bd614L);

  public static final Value _800bd61c = MEMORY.ref(2, 0x800bd61cL);

  public static final Value _800bd6f8 = MEMORY.ref(4, 0x800bd6f8L);

  public static final Value _800bd700 = MEMORY.ref(1, 0x800bd700L);
  public static final Value _800bd704 = MEMORY.ref(4, 0x800bd704L);
  public static final Value _800bd708 = MEMORY.ref(4, 0x800bd708L);
  public static final Value _800bd70c = MEMORY.ref(4, 0x800bd70cL);
  public static final Value _800bd710 = MEMORY.ref(4, 0x800bd710L);
  public static final Value _800bd714 = MEMORY.ref(4, 0x800bd714L);

  public static final Value _800bd740 = MEMORY.ref(4, 0x800bd740L);

  public static final Value linkedListEntry_800bd76c = MEMORY.ref(4, 0x800bd76cL);

  public static final Value linkedListEntry_800bd778 = MEMORY.ref(4, 0x800bd778L);

  public static final Value _800bd780 = MEMORY.ref(1, 0x800bd780L);
  public static final Value _800bd781 = MEMORY.ref(1, 0x800bd781L);
  public static final Value _800bd782 = MEMORY.ref(1, 0x800bd782L);

  public static final Value linkedListEntry_800bd784 = MEMORY.ref(4, 0x800bd784L);
  public static final Value linkedListEntry_800bd788 = MEMORY.ref(4, 0x800bd788L);

  public static final Value _800bd7ac = MEMORY.ref(4, 0x800bd7acL);
  public static final Value _800bd7b0 = MEMORY.ref(4, 0x800bd7b0L);
  public static final Value _800bd7b4 = MEMORY.ref(2, 0x800bd7b4L);

  public static final Value _800bd7b8 = MEMORY.ref(4, 0x800bd7b8L);

  public static final Value _800bd7c0 = MEMORY.ref(1, 0x800bd7c0L);

  public static final Value _800bd808 = MEMORY.ref(4, 0x800bd808L);
  public static final Value _800bd80c = MEMORY.ref(4, 0x800bd80cL);

  public static final Value _800bd9f8 = MEMORY.ref(1, 0x800bd9f8L);

  public static final Value _800bda10 = MEMORY.ref(4, 0x800bda10L);

  public static final Value _800bda84 = MEMORY.ref(2, 0x800bda84L);
  public static final Value _800bda86 = MEMORY.ref(2, 0x800bda86L);
  public static final Value _800bda88 = MEMORY.ref(2, 0x800bda88L);

  public static final Value _800bdaad = MEMORY.ref(1, 0x800bdaadL);

  public static final Value _800bdadc = MEMORY.ref(1, 0x800bdadcL);

  public static final Value _800bdb38 = MEMORY.ref(1, 0x800bdb38L);

  public static final Value _800bdb88 = MEMORY.ref(4, 0x800bdb88L);

  public static final Value _800bdb90 = MEMORY.ref(4, 0x800bdb90L);

  public static final Value _800bdc24 = MEMORY.ref(4, 0x800bdc24L);

  public static final Value _800bdc40 = MEMORY.ref(4, 0x800bdc40L);

  public static final Value linkedListEntry_800bdc50 = MEMORY.ref(4, 0x800bdc50L);

  public static final Value _800bdc5c = MEMORY.ref(4, 0x800bdc5cL);

  public static final Value _800bdea0 = MEMORY.ref(4, 0x800bdea0L);

  public static final Value _800bdf00 = MEMORY.ref(4, 0x800bdf00L);
  public static final Value _800bdf04 = MEMORY.ref(4, 0x800bdf04L);
  public static final Value _800bdf08 = MEMORY.ref(4, 0x800bdf08L);

  public static final Value _800bdf18 = MEMORY.ref(4, 0x800bdf18L);

  public static final Value _800bdf38 = MEMORY.ref(4, 0x800bdf38L);

  public static final Value _800be358 = MEMORY.ref(4, 0x800be358L);

  public static final Value _800be5b8 = MEMORY.ref(4, 0x800be5b8L);
  public static final Value _800be5bc = MEMORY.ref(4, 0x800be5bcL);
  public static final Value _800be5c0 = MEMORY.ref(4, 0x800be5c0L);
  public static final Value _800be5c4 = MEMORY.ref(2, 0x800be5c4L);
  public static final Value _800be5c8 = MEMORY.ref(4, 0x800be5c8L);

  public static final Value _800be5d0 = MEMORY.ref(4, 0x800be5d0L);

  public static final Value _800be5d8 = MEMORY.ref(1, 0x800be5d8L);
  public static final Value _800be5d9 = MEMORY.ref(1, 0x800be5d9L);
  public static final Value _800be5da = MEMORY.ref(1, 0x800be5daL);
  public static final Value _800be5db = MEMORY.ref(1, 0x800be5dbL);
  public static final Value _800be5dc = MEMORY.ref(1, 0x800be5dcL);
  public static final Value _800be5dd = MEMORY.ref(1, 0x800be5ddL);
  public static final Value _800be5de = MEMORY.ref(1, 0x800be5deL);
  public static final Value _800be5df = MEMORY.ref(1, 0x800be5dfL);
  public static final Value _800be5e0 = MEMORY.ref(1, 0x800be5e0L);
  public static final Value _800be5e1 = MEMORY.ref(1, 0x800be5e1L);
  public static final Value _800be5e2 = MEMORY.ref(1, 0x800be5e2L);
  public static final Value _800be5e3 = MEMORY.ref(1, 0x800be5e3L);
  public static final Value _800be5e4 = MEMORY.ref(1, 0x800be5e4L);
  public static final Value _800be5e5 = MEMORY.ref(1, 0x800be5e5L);
  public static final Value _800be5e6 = MEMORY.ref(1, 0x800be5e6L);
  public static final Value _800be5e7 = MEMORY.ref(1, 0x800be5e7L);
  public static final Value _800be5e8 = MEMORY.ref(1, 0x800be5e8L);
  public static final Value _800be5e9 = MEMORY.ref(1, 0x800be5e9L);
  public static final Value _800be5ea = MEMORY.ref(1, 0x800be5eaL);
  public static final Value _800be5eb = MEMORY.ref(1, 0x800be5ebL);
  public static final Value _800be5ec = MEMORY.ref(1, 0x800be5ecL);
  public static final Value _800be5ed = MEMORY.ref(1, 0x800be5edL);
  public static final Value _800be5ee = MEMORY.ref(1, 0x800be5eeL);
  public static final Value _800be5ef = MEMORY.ref(1, 0x800be5efL);
  public static final Value _800be5f0 = MEMORY.ref(1, 0x800be5f0L);
  public static final Value _800be5f1 = MEMORY.ref(1, 0x800be5f1L);
  public static final Value _800be5f2 = MEMORY.ref(1, 0x800be5f2L);
  public static final Value _800be5f3 = MEMORY.ref(1, 0x800be5f3L);

  //TODO This is a giant structure
  public static final Value _800be5f8 = MEMORY.ref(4, 0x800be5f8L);
  public static final Value _800be5fc = MEMORY.ref(2, 0x800be5fcL);
  public static final Value _800be5fe = MEMORY.ref(2, 0x800be5feL);
  public static final Value _800be600 = MEMORY.ref(2, 0x800be600L);
  public static final Value _800be602 = MEMORY.ref(2, 0x800be602L);
  public static final Value _800be604 = MEMORY.ref(2, 0x800be604L);
  public static final Value _800be606 = MEMORY.ref(1, 0x800be606L);
  public static final Value _800be607 = MEMORY.ref(1, 0x800be607L);

  public static final Value _800be628 = MEMORY.ref(1, 0x800be628L);

  public static final Value _800be62d = MEMORY.ref(1, 0x800be62dL);
  public static final Value _800be62e = MEMORY.ref(1, 0x800be62eL);

  public static final Value _800be636 = MEMORY.ref(1, 0x800be636L);

  public static final Value _800be63e = MEMORY.ref(2, 0x800be63eL);
  public static final Value _800be640 = MEMORY.ref(2, 0x800be640L);
  public static final Value _800be642 = MEMORY.ref(2, 0x800be642L);
  public static final Value _800be644 = MEMORY.ref(2, 0x800be644L);
  public static final Value _800be646 = MEMORY.ref(2, 0x800be646L);
  public static final Value _800be648 = MEMORY.ref(2, 0x800be648L);
  public static final Value _800be64a = MEMORY.ref(2, 0x800be64aL);
  public static final Value _800be64c = MEMORY.ref(2, 0x800be64cL);
  public static final Value _800be64e = MEMORY.ref(2, 0x800be64eL);
  public static final Value _800be650 = MEMORY.ref(2, 0x800be650L);
  public static final Value _800be652 = MEMORY.ref(2, 0x800be652L);
  public static final Value _800be654 = MEMORY.ref(2, 0x800be654L);
  public static final Value _800be656 = MEMORY.ref(2, 0x800be656L);
  public static final Value _800be658 = MEMORY.ref(2, 0x800be658L);
  public static final Value _800be65a = MEMORY.ref(2, 0x800be65aL);
  public static final Value _800be65c = MEMORY.ref(2, 0x800be65cL);
  public static final Value _800be65e = MEMORY.ref(2, 0x800be65eL);
  public static final Value _800be660 = MEMORY.ref(1, 0x800be660L);
  public static final Value _800be661 = MEMORY.ref(1, 0x800be661L);
  public static final Value _800be662 = MEMORY.ref(1, 0x800be662L);
  public static final Value _800be663 = MEMORY.ref(1, 0x800be663L);
  public static final Value _800be664 = MEMORY.ref(1, 0x800be664L);
  public static final Value _800be665 = MEMORY.ref(1, 0x800be665L);
  public static final Value _800be666 = MEMORY.ref(1, 0x800be666L);
  public static final Value _800be667 = MEMORY.ref(1, 0x800be667L);
  public static final Value _800be668 = MEMORY.ref(1, 0x800be668L);
  public static final Value _800be669 = MEMORY.ref(1, 0x800be669L);
  public static final Value _800be66a = MEMORY.ref(1, 0x800be66aL);
  public static final Value _800be66b = MEMORY.ref(1, 0x800be66bL);
  public static final Value _800be66c = MEMORY.ref(1, 0x800be66cL);
  public static final Value _800be66d = MEMORY.ref(1, 0x800be66dL);
  public static final Value _800be66e = MEMORY.ref(1, 0x800be66eL);
  public static final Value _800be66f = MEMORY.ref(1, 0x800be66fL);
  public static final Value _800be670 = MEMORY.ref(1, 0x800be670L);
  public static final Value _800be671 = MEMORY.ref(1, 0x800be671L);
  public static final Value _800be672 = MEMORY.ref(1, 0x800be672L);
  public static final Value _800be673 = MEMORY.ref(1, 0x800be673L);
  public static final Value _800be674 = MEMORY.ref(1, 0x800be674L);
  public static final Value _800be675 = MEMORY.ref(1, 0x800be675L);
  public static final Value _800be676 = MEMORY.ref(1, 0x800be676L);
  public static final Value _800be677 = MEMORY.ref(1, 0x800be677L);
  public static final Value _800be678 = MEMORY.ref(1, 0x800be678L);
  public static final Value _800be679 = MEMORY.ref(1, 0x800be679L);
  public static final Value _800be67a = MEMORY.ref(1, 0x800be67aL);
  public static final Value _800be67b = MEMORY.ref(1, 0x800be67bL);
  public static final Value _800be67c = MEMORY.ref(1, 0x800be67cL);
  public static final Value _800be67e = MEMORY.ref(2, 0x800be67eL);
  public static final Value _800be680 = MEMORY.ref(2, 0x800be680L);
  public static final Value _800be682 = MEMORY.ref(2, 0x800be682L);
  public static final Value _800be684 = MEMORY.ref(2, 0x800be684L);
  public static final Value _800be686 = MEMORY.ref(2, 0x800be686L);
  public static final Value _800be688 = MEMORY.ref(2, 0x800be688L);
  public static final Value _800be68a = MEMORY.ref(2, 0x800be68aL);
  public static final Value _800be68c = MEMORY.ref(2, 0x800be68cL);
  public static final Value _800be68e = MEMORY.ref(2, 0x800be68eL);
  public static final Value _800be690 = MEMORY.ref(1, 0x800be690L);
  public static final Value _800be691 = MEMORY.ref(1, 0x800be691L);
  public static final Value _800be692 = MEMORY.ref(1, 0x800be692L);
  public static final Value _800be693 = MEMORY.ref(1, 0x800be693L);
  public static final Value _800be694 = MEMORY.ref(2, 0x800be694L);
  public static final Value _800be696 = MEMORY.ref(1, 0x800be696L);
  public static final Value _800be697 = MEMORY.ref(1, 0x800be697L);
  //TODO

  public static final Value _800bed60 = MEMORY.ref(2, 0x800bed60L);
  public static final Value _800bed62 = MEMORY.ref(2, 0x800bed62L);
  public static final Value _800bed64 = MEMORY.ref(2, 0x800bed64L);
  public static final Value _800bed66 = MEMORY.ref(2, 0x800bed66L);

  public static final Value _800bed6c = MEMORY.ref(2, 0x800bed6eL);
  public static final Value _800bed6e = MEMORY.ref(2, 0x800bed6cL);

  public static final Value _800bed72 = MEMORY.ref(2, 0x800bed72L);
  public static final Value _800bed74 = MEMORY.ref(2, 0x800bed74L);
  public static final Value _800bed76 = MEMORY.ref(2, 0x800bed76L);

  public static final Value _800bed94 = MEMORY.ref(1, 0x800bed94L);

  public static final Value _800bed9c = MEMORY.ref(4, 0x800bed9cL);

  public static final Value _800beda8 = MEMORY.ref(2, 0x800beda8L);

  public static final Value _800beda4 = MEMORY.ref(4, 0x800beda4L);

  public static final Value _800bedb2 = MEMORY.ref(2, 0x800bedb2L);

  public static final Value _800bedb6 = MEMORY.ref(2, 0x800bedb6L);

  /**
   * TODO 0x90-byte struct
   */
//  public static final ArrayRef<JoyStruct> _800bedb8 = MEMORY.ref(4, 0x800bedb8L, ArrayRef.of(JoyStruct.class, 2, 0x90, JoyStruct::new));
  //+0
  public static final Value _800bedb8 = MEMORY.ref(1, 0x800bedb8L);
  public static final Value _800bedb9 = MEMORY.ref(1, 0x800bedb9L);
  public static final Value _800bedba = MEMORY.ref(1, 0x800bedbaL);
  public static final Value _800bedbb = MEMORY.ref(1, 0x800bedbbL);
  //+4
  public static final Value _800bedbc = MEMORY.ref(2, 0x800bedbcL);
  //+6
  public static final ArrayRef<ByteRef> _800bedbe = MEMORY.ref(1, 0x800bedbeL, ArrayRef.of(ByteRef.class, 35, 1, ByteRef::new));

  //+28
  public static final Value _800bede0 = MEMORY.ref(1, 0x800bede0L);
  //+29
  public static final Value _800bede1 = MEMORY.ref(1, 0x800bede1L);
  //+2a
  public static final Value _800bede2 = MEMORY.ref(1, 0x800bede2L);
  //+2b
  public static final Value _800bede3 = MEMORY.ref(1, 0x800bede3L);
  //+2c
  public static final Value _800bede4 = MEMORY.ref(1, 0x800bede4L);

  //+30
  public static final Value _800bede8 = MEMORY.ref(4, 0x800bede8L);
  //+34
  public static final Value _800bedec = MEMORY.ref(1, 0x800bedecL);
  // End of struct 800bee47

  /**
   * TODO 0x90-byte struct
   */
  //+0
  public static final Value _800bee48 = MEMORY.ref(1, 0x800bee48L);
  public static final Value _800bee49 = MEMORY.ref(1, 0x800bee49L);
  public static final Value _800bee4a = MEMORY.ref(1, 0x800bee4aL);
  public static final Value _800bee4b = MEMORY.ref(1, 0x800bee4bL);

  //+6
  public static final ArrayRef<ByteRef> _800bee4e = MEMORY.ref(1, 0x800bee4eL, ArrayRef.of(ByteRef.class, 35, 1, ByteRef::new));

  //+38
  public static final Value _800bee80 = MEMORY.ref(4, 0x800bee80L);

  //+40
  public static final Value _800bee88 = MEMORY.ref(4, 0x800bee88L);
  //+44
  public static final Value _800bee8c = MEMORY.ref(4, 0x800bee8cL);
  //+48
  public static final Value _800bee90 = MEMORY.ref(4, 0x800bee90L);
  //+4c
  public static final Value _800bee94 = MEMORY.ref(4, 0x800bee94L);
  //+50
  public static final Value _800bee98 = MEMORY.ref(4, 0x800bee98L);
  //+54
  public static final Value _800bee9c = MEMORY.ref(4, 0x800bee9cL);

  //+5c
  public static final Value _800beea4 = MEMORY.ref(4, 0x800beea8L);

  //+64
  public static final Value _800beeac = MEMORY.ref(4, 0x800beeacL);

  //+6c
  public static final Value _800beeb4 = MEMORY.ref(4, 0x800beeb8L);

  //+74
  public static final Value _800beebc = MEMORY.ref(4, 0x800beebcL);

  //+7c
  public static final Value _800beec4 = MEMORY.ref(4, 0x800beec4L);
  // End of struct 800beed7

  public static final Value _800bef44 = MEMORY.ref(4, 0x800bef44L);

  public static final Value _800befc4 = MEMORY.ref(4, 0x800befc4L);

  public static final Value _800bf044 = MEMORY.ref(1, 0x800bf044L);

  public static final Value _800bf064 = MEMORY.ref(4, 0x800bf064L);
  public static final Value _800bf068 = MEMORY.ref(2, 0x800bf068L);
  public static final Value _800bf06a = MEMORY.ref(2, 0x800bf06aL);
  public static final Value _800bf06c = MEMORY.ref(2, 0x800bf06cL);
  public static final Value _800bf06e = MEMORY.ref(2, 0x800bf06eL);

  public static final Value _800bf074 = MEMORY.ref(2, 0x800bf074L);
  public static final Value _800bf076 = MEMORY.ref(2, 0x800bf076L);

  public static final Value _800bf07a = MEMORY.ref(2, 0x800bf07aL);
  public static final Value _800bf07c = MEMORY.ref(2, 0x800bf07cL);
  public static final Value _800bf07e = MEMORY.ref(2, 0x800bf07eL);

  public static final Value _800bf0a8 = MEMORY.ref(1, 0x800bf0a8L);
  public static final Value _800bf0ac = MEMORY.ref(4, 0x800bf0acL);

  public static final Value _800bf0b4 = MEMORY.ref(4, 0x800bf0b4L);

  public static final Value _800bf0c0 = MEMORY.ref(4, 0x800bf0c0L);
  public static final Value _800bf0c4 = MEMORY.ref(4, 0x800bf0c4L);
  public static final Value _800bf0c8 = MEMORY.ref(4, 0x800bf0c8L);
  public static final Value _800bf0cc = MEMORY.ref(1, 0x800bf0ccL);
  public static final Value _800bf0cd = MEMORY.ref(1, 0x800bf0cdL);
  public static final Value _800bf0ce = MEMORY.ref(1, 0x800bf0ceL);
  public static final Value _800bf0cf = MEMORY.ref(1, 0x800bf0cfL);
  public static final Value _800bf0d0 = MEMORY.ref(1, 0x800bf0d0L);

  public static final Value _800bf0d8 = MEMORY.ref(4, 0x800bf0d8L);

  public static final Value _800bf0dc = MEMORY.ref(4, 0x800bf0dcL);
  public static final Value _800bf0e0 = MEMORY.ref(4, 0x800bf0e0L);

  public static final Value _800bf0ec = MEMORY.ref(4, 0x800bf0ecL);

  public static final Value _800bf140 = MEMORY.ref(4, 0x800bf140L);
  public static final Value _800bf144 = MEMORY.ref(4, 0x800bf144L);
  public static final Value _800bf148 = MEMORY.ref(4, 0x800bf148L);
  public static final Value _800bf14c = MEMORY.ref(4, 0x800bf14cL);
  public static final Value _800bf150 = MEMORY.ref(4, 0x800bf150L);
  public static final Value _800bf154 = MEMORY.ref(4, 0x800bf154L);
  public static final Value _800bf158 = MEMORY.ref(4, 0x800bf158L);

  public static final Value _800bf160 = MEMORY.ref(4, 0x800bf160L);
  public static final Value _800bf164 = MEMORY.ref(4, 0x800bf164L);

  public static final Value _800bf170 = MEMORY.ref(4, 0x800bf170L);
  public static final Value _800bf174 = MEMORY.ref(4, 0x800bf174L);
  public static final Value _800bf178 = MEMORY.ref(4, 0x800bf178L);
  public static final Value _800bf17c = MEMORY.ref(4, 0x800bf17cL);
  public static final Value cardPort_800bf180 = MEMORY.ref(4, 0x800bf180L);
  public static final Value _800bf184 = MEMORY.ref(4, 0x800bf184L);

  public static final Pointer<BiConsumerRef<Long, Long>> _800bf1b4 = MEMORY.ref(4, 0x800bf1b4L, Pointer.of(BiConsumerRef::new));
  public static final Value _800bf1b8 = MEMORY.ref(4, 0x800bf1b8L);
  public static final Value _800bf1bc = MEMORY.ref(4, 0x800bf1bcL);
  public static final Value _800bf1c0 = MEMORY.ref(4, 0x800bf1c0L);
  public static final Value _800bf1c4 = MEMORY.ref(4, 0x800bf1c4L);

  public static final Value _800bf200 = MEMORY.ref(4, 0x800bf200L);

  public static final Value _800bf23c = MEMORY.ref(4, 0x800bf23cL);
  public static final Value _800bf240 = MEMORY.ref(4, 0x800bf240L);

  public static final Value SwCARD_EvSpIOE_EventId_800bf250 = MEMORY.ref(4, 0x800bf250L);
  public static final Value SwCARD_EvSpERROR_EventId_800bf254 = MEMORY.ref(4, 0x800bf254L);
  public static final Value SwCARD_EvSpTIMOUT_EventId_800bf258 = MEMORY.ref(4, 0x800bf258L);
  public static final Value SwCARD_EvSpNEW_EventId_800bf25c = MEMORY.ref(4, 0x800bf25cL);
  public static final Value HwCARD_EvSpIOE_EventId_800bf260 = MEMORY.ref(4, 0x800bf260L);
  public static final Value HwCARD_EvSpERROR_EventId_800bf264 = MEMORY.ref(4, 0x800bf264L);
  public static final Value HwCARD_EvSpTIMOUT_EventId_800bf268 = MEMORY.ref(4, 0x800bf268L);
  public static final Value HwCARD_EvSpNEW_EventId_800bf26c = MEMORY.ref(4, 0x800bf26cL);
  public static final Value _800bf270 = MEMORY.ref(4, 0x800bf270L);
  public static final Value _800bf274 = MEMORY.ref(4, 0x800bf274L);
  public static final Value _800bf278 = MEMORY.ref(4, 0x800bf278L);
  public static final Value _800bf27c = MEMORY.ref(4, 0x800bf27cL);
  public static final Value _800bf280 = MEMORY.ref(4, 0x800bf280L);
  public static final Value _800bf284 = MEMORY.ref(4, 0x800bf284L);
  public static final Value _800bf288 = MEMORY.ref(4, 0x800bf288L);
  public static final Value _800bf28c = MEMORY.ref(4, 0x800bf28cL);

  public static final Value _800bf550 = MEMORY.ref(4, 0x800bf550L);
  public static final Value _800bf554 = MEMORY.ref(2, 0x800bf554L);

  public static final Value _800bf558 = MEMORY.ref(4, 0x800bf558L);
  public static final Value _800bf55c = MEMORY.ref(4, 0x800bf55cL);
  public static final Value _800bf560 = MEMORY.ref(4, 0x800bf560L);
  public static final Value _800bf564 = MEMORY.ref(4, 0x800bf564L);
  public static final Value _800bf568 = MEMORY.ref(4, 0x800bf568L);
  public static final Value _800bf56c = MEMORY.ref(4, 0x800bf56cL);
  public static final Value _800bf570 = MEMORY.ref(4, 0x800bf570L);
  public static final Value _800bf574 = MEMORY.ref(4, 0x800bf574L);
  public static final Value _800bf578 = MEMORY.ref(4, 0x800bf578L);
  public static final Value _800bf57c = MEMORY.ref(4, 0x800bf57cL);
  public static final Value _800bf580 = MEMORY.ref(4, 0x800bf580L);
  public static final Value _800bf584 = MEMORY.ref(4, 0x800bf584L);
  public static final Value _800bf588 = MEMORY.ref(4, 0x800bf588L);
  public static final Value _800bf58c = MEMORY.ref(4, 0x800bf58cL);
  public static final Value _800bf590 = MEMORY.ref(4, 0x800bf590L);
  public static final Value _800bf594 = MEMORY.ref(4, 0x800bf594L);
  public static final Pointer<RunnableRef> cdromDmaSubCallback_800bf598 = MEMORY.ref(4, 0x800bf598L, Pointer.of(RunnableRef::new));
  public static final Value _800bf59c = MEMORY.ref(4, 0x800bf59cL);
  public static final Value _800bf5a0 = MEMORY.ref(4, 0x800bf5a0L);

  public static final Value _800bf5b0 = MEMORY.ref(4, 0x800bf5b0L);
  public static final Value _800bf5b4 = MEMORY.ref(4, 0x800bf5b4L);

  public static final ArrayRef<ByteRef> cdromResponses_800bf5c0 = MEMORY.ref(8, 0x800bf5c0L, ArrayRef.of(ByteRef.class, 8, 1, ByteRef::new));
  public static final ArrayRef<ByteRef> cdromResponses_800bf5c8 = MEMORY.ref(8, 0x800bf5c8L, ArrayRef.of(ByteRef.class, 8, 1, ByteRef::new));
  public static final ArrayRef<ByteRef> cdromResponses_800bf5d0 = MEMORY.ref(8, 0x800bf5d0L, ArrayRef.of(ByteRef.class, 8, 1, ByteRef::new));

  public static final Pointer<CString> _800bf5e0 = MEMORY.ref(4, 0x800bf5e0L, Pointer.of(CString::new));

  public static final BoolRef sectorIsDataOnly_800bf5f0 = MEMORY.ref(4, 0x800bf5f0L, BoolRef::new);

  public static final Value _800bf5f8 = MEMORY.ref(4, 0x800bf5f8L);
  public static final Value _800bf5fc = MEMORY.ref(4, 0x800bf5fcL);
  public static final Value _800bf600 = MEMORY.ref(4, 0x800bf600L);
  public static final Value _800bf604 = MEMORY.ref(4, 0x800bf604L);

  public static final Value batch_800bf608 = MEMORY.ref(4, 0x800bf608L);
  public static final EnumRef<SyncCode> syncCode_800bf60c = MEMORY.ref(1, 0x800bf60cL, EnumRef.of(SyncCode.values()));
  public static final Value response_800bf60d = MEMORY.ref(1, 0x800bf60dL);

  public static final Value batch_800bf618 = MEMORY.ref(4, 0x800bf618L);
  public static final EnumRef<SyncCode> syncCode_800bf61c = MEMORY.ref(1, 0x800bf61cL, EnumRef.of(SyncCode.values()));
  public static final Value response_800bf61d = MEMORY.ref(1, 0x800bf61dL);

  public static final Value batch_800bf628 = MEMORY.ref(4, 0x800bf628L);
  public static final EnumRef<SyncCode> syncCode_800bf62c = MEMORY.ref(1, 0x800bf62cL, EnumRef.of(SyncCode.values()));
  public static final Value response_800bf62d = MEMORY.ref(1, 0x800bf62dL);

  // Command buffer
  // Repeats 8 times in memory
  public static final ArrayRef<CdlPacket> CdlPacket_800bf638 = MEMORY.ref(4, 0x800bf638L, ArrayRef.of(CdlPacket.class, DSL_MAX_COMMAND, 0x18, CdlPacket::new));

  public static final Value cdromParamsPtr_800bf644 = MEMORY.ref(4, 0x800bf644L); //TODO figure out a way to remove refs to this
  //

  public static final Value _800bf6f8 = MEMORY.ref(4, 0x800bf6f8L);
  public static final Value _800bf6fc = MEMORY.ref(4, 0x800bf6fcL);
  public static final Value cdlPacketIndex_800bf700 = MEMORY.ref(4, 0x800bf700L);

  public static final ArrayRef<Response> cdromResponseBuffer_800bf708 = MEMORY.ref(4, 0x800bf708L, ArrayRef.of(Response.class, DSL_MAX_COMMAND, 0x10, Response::new));

  public static final Value _800bf778 = MEMORY.ref(4, 0x800bf778L);
  public static final Value _800bf77c = MEMORY.ref(4, 0x800bf77cL);
  public static final Value _800bf780 = MEMORY.ref(4, 0x800bf780L);
  public static final Value _800bf784 = MEMORY.ref(4, 0x800bf784L);
  public static final Value cdromResponseBufferIndex_800bf788 = MEMORY.ref(4, 0x800bf788L);

  public static final Pointer<RunnableRef> _800bf798 = MEMORY.ref(4, 0x800bf798L, Pointer.of(RunnableRef::new));
  public static final Pointer<BiConsumerRef<SyncCode, byte[]>> _800bf79c = MEMORY.ref(4, 0x800bf79cL, Pointer.of(BiConsumerRef::new));
  public static final Pointer<BiConsumerRef<SyncCode, byte[]>> cdromReadCompleteSubCallbackPtr_800bf7a0 = MEMORY.ref(4, 0x800bf7a0L, Pointer.of(BiConsumerRef::new));
  public static final Pointer<BiConsumerRef<SyncCode, byte[]>> _800bf7a4 = MEMORY.ref(4, 0x800bf7a4L, Pointer.of(BiConsumerRef::new));
  /**
   * CD file list
   *
   * 0x800bf7a8-0x800bfda8
   */
  public static final ArrayRef<CdlFILE> CdlFILE_800bf7a8 = MEMORY.ref(1, 0x800bf7a8L, ArrayRef.of(CdlFILE.class, 40, 24, CdlFILE::new));

  /**
   * TODO Seems to be a pointer to the CdlLOC of file #62. Not sure why.
   */
  public static final Value _800bfd84 = MEMORY.ref(4, 0x800bfd84L);
  //

  public static final ArrayRef<CdlDIR> CdlDIR_800bfda8 = MEMORY.ref(1600, 0x800bfda8L, ArrayRef.of(CdlDIR.class, 0x80, 0x2c, CdlDIR::new));

  public static final Value _800bfdd8 = MEMORY.ref(4, 0x800bfdd8L);
}
