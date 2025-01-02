
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
                        "

#MACHINE_EXTRA_RRECOMMENDS:append =

#TOOLCHAIN_TARGET_TASK:append = "igh-dev libevl-dev kernel-dev kernel-devsrc"
TOOLCHAIN_TARGET_TASK:append = " kernel-devsrc"


#inherit extrausers
#EXTRA_USERS_PARAMS = "\
#    usermod -p '$6$XV1W32lyI8./8S/h$zMUSaqpSI.Gi8YlqNfbZpc2hc2o9U2fVr7ReYGjcMjhl5Ryq9oBVOoWTh2nXxDQBfzQw/2376NM9bYZW1sCip0' root; \
#    "
