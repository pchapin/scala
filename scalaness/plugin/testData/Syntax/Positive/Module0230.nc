# 1 "./RemoteSelectorC.nc"
# 1 "<built-in>"
# 1 "<command-line>"
# 1 "./RemoteSelectorC.nc"

# 1 "./ComponentManager.h" 1

// This test case has been hacked to work around a parser bug. Obviously the bug should be fixed
// at some point. When that happens, this test case can be "hardened" again. The parser does not
// seem to understand typedef names that are used in structure definitions.

/* typedef */ struct component_id {
   uint16_t node_id;
   uint8_t local_id;
} /* component_id */;

/* typedef */ struct componet_set {
    struct component_id *ids;            // Parser can't handle a typedef name here.
    int count;
} /* component_set */;
# 3 "./RemoteSelectorC.nc" 2

module RemoteSelectorC {
    provides interface ComponentManager;
}
implementation {
    # 4 "SomeFile.nc"  // Are line directives properly ignored here?
    struct component_id broadcast = { 0xFFFF, 0x01 };

    command struct component_set ComponentManager.elements()
    {
        # 5 "SomeFile.nc"  // Are line directives properly ignored here?
        struct componet_set result = { broadcast, 1 };
        # 6 "SomeFile.nc"  // Are line directives properly ignored here?
        return result;
    }
}
