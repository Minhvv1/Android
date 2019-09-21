package com.t3h.appdc.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.t3h.appdc.R;
import com.t3h.appdc.model.Pets;

public class ShareAdapter {

    class ShareHolder extends RecyclerView.ViewHolder {
        private ImageView imPetShare;
        private TextView tvNamePet, tvDes, tvGen;

        public ShareHolder(@NonNull View itemView) {
            super(itemView);
            imPetShare = itemView.findViewById(R.id.tv_namePets);
            tvNamePet = itemView.findViewById(R.id.tv_name);
            tvDes = itemView.findViewById(R.id.tv_desc);
            tvGen = itemView.findViewById(R.id.tv_gen);
        }
        public void bindData(Pets pet){
            tvNamePet.setText(pet.getName());
            tvDes.setText(pet.getName());
//            String tt = "Tuổi: "+pet.getAge() +" Giới tính: ";
//            if (pet.isGener() == true) {
//                tt = tt+"Đực";
//            }else{
//                tt = tt+"Cái";
//            }
//
//            tvGen.setText(tt);

            Glide.with(imPetShare)
                    .load(pet.getPicture())
                    .placeholder(R.mipmap.ic_launcher)
                    .error(android.R.drawable.ic_delete)
                    .into(imPetShare);
        }
    }
}
