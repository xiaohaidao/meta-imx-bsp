
require recipes-core/images/core-image-minimal.bb

# packages
EXTRA_IMAGE_FEATURES += "ssh-server-openssh"
IMAGE_INSTALL:append = " opkg"
IMAGE_INSTALL:append = " libevl"