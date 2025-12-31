
require recipes-core/images/core-image-minimal.bb

# PREFERRED_PROVIDER_virtual/kernel ?= "linux-evl"

# packages
EXTRA_IMAGE_FEATURES += " ssh-server-openssh \
                          package-management \
                        "

# e2fsprogs for mkfs.ext4
IMAGE_INSTALL:append = " opkg \
                         libevl \
                         igh \
                         ros-core \ 
                        "

QEMU_TARGETS:append = " armeb"

#MACHINE_EXTRA_RRECOMMENDS:append =

#TOOLCHAIN_TARGET_TASK:append = "igh-dev libevl-dev kernel-dev kernel-devsrc"
TOOLCHAIN_TARGET_TASK:append = " kernel-devsrc"


inherit extrausers
EXTRA_USERS_PARAMS = "\
    usermod -p '\$1\$0ooe8il1\$iUepfqN/Rkgm1l9k7VC4x0' root; \
    "
