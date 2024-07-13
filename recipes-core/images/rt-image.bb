
require recipes-core/images/core-image-minimal.bb

# packages
EXTRA_IMAGE_FEATURES += " ssh-server-openssh \
                          package-management \
                        "

# e2fsprogs for mkfs.ext4
IMAGE_INSTALL:append = " opkg \
                         libevl \
                         e2fsprogs \
                         igh \
                        "

#MACHINE_EXTRA_RRECOMMENDS:append =


#inherit extrausers
#EXTRA_USERS_PARAMS = "\
#    usermod -p '$6$XV1W32lyI8./8S/h$zMUSaqpSI.Gi8YlqNfbZpc2hc2o9U2fVr7ReYGjcMjhl5Ryq9oBVOoWTh2nXxDQBfzQw/2376NM9bYZW1sCip0' root; \
#    "