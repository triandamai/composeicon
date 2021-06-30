package dev.farhanroy.composeicon

sealed class ComposeIconType(val src: Int) {
    class SolidIcon(private val icon: Int) : ComposeIconType(icon)

    class RegularIcon(private val icon: Int) : ComposeIconType(icon)

    class BrandIcon(private val icon: Int) : ComposeIconType(icon)

    class Foundation(private val icon: Int) : ComposeIconType(icon)

    class EvilIcons(private val icon: Int) : ComposeIconType(icon)

    class AntDesign(private val icon: Int) : ComposeIconType(icon)

    class Entypo(private val icon: Int) : ComposeIconType(icon)
}

